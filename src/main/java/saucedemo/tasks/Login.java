package saucedemo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import saucedemo.interactions.EscribirTexto;
import saucedemo.userinterfaces.LoginPage;

public class Login implements Task {

    private final String usuario;
    private final String password;

    public Login(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public static Login conCredenciales(String usuario, String password) {
        return new Login(usuario, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                EscribirTexto.en(LoginPage.USERNAME_FIELD, usuario),
                EscribirTexto.en(LoginPage.PASSWORD_FIELD, password),
                Click.on(LoginPage.LOGIN_BUTTON)
        );
    }
}
