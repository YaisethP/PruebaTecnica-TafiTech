package saucedemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductsPage {
    public static final Target FIRST_PRODUCT_ADD_BUTTON = Target.the("botón de agregar primer producto")
            .located(By.cssSelector("button[id^='add-to-cart']"));
    public static final Target CART_ICON = Target.the("icono del carrito")
            .located(By.id("shopping_cart_container"));
}
