package saucedemo.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebDriver;
import saucedemo.tasks.*;
import saucedemo.questions.*;
import saucedemo.userinterfaces.*;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.assertj.core.api.Assertions.assertThat;
import saucedemo.utils.DriverUtils;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class SaucedemoStepDefinitions {

    private Actor usuario;
    private WebDriver driver;

    @Given("el usuario está en la página de login")
    public void el_usuario_esta_en_la_pagina_de_login() {
        OnStage.setTheStage(new OnlineCast());
        usuario = OnStage.theActorCalled("Usuario");
        driver = DriverUtils.getChromeDriverIncognito();
        usuario.can(BrowseTheWeb.with(driver));
        driver.get("https://www.saucedemo.com/");
    }

    @When("el usuario inicia sesión con credenciales válidas")
    public void el_usuario_inicia_sesion_con_credenciales_validas() {
        usuario.attemptsTo(
                Login.conCredenciales("standard_user", "secret_sauce")
        );
    }

    @When("agrega un producto al carrito")
    public void agrega_un_producto_al_carrito() {
        usuario.attemptsTo(
                AgregarProducto.alCarrito()
        );
    }

    @Then("el producto debería aparecer en el carrito")
    public void el_producto_deberia_aparecer_en_el_carrito() {
        usuario.attemptsTo(
                WaitUntil.the(CartPage.PRODUCT_NAME, isVisible()).forNoMoreThan(10).seconds()
        );

        String producto = usuario.asksFor(ProductoEnCarrito.esVisible());
        assertThat(producto).isNotEmpty();
    }

    @When("el usuario intenta iniciar sesión con credenciales inválidas")
    public void el_usuario_intenta_iniciar_sesion_con_credenciales_invalidas() {
        usuario.attemptsTo(
                Login.conCredenciales("locked_out_user", "secret_sauce")
        );
    }

    @Then("debería ver un mensaje de error indicando que el login falló")
    public void deberia_ver_un_mensaje_de_error_indicando_que_el_login_fallo() {
        usuario.attemptsTo(
                WaitUntil.the(LoginPage.ERROR_MESSAGE, isVisible()).forNoMoreThan(10).seconds()
        );

        String mensaje = usuario.asksFor(MensajeError.seMuestra());
        assertThat(mensaje).contains("Epic sadface");
    }

    // Hook para cerrar navegador después de cada escenario
    @After
    public void cerrarNavegador() {
        if (driver != null) {
            driver.quit();
        }
    }
}
