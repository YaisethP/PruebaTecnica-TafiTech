package saucedemo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CartPage {
    public static final Target PRODUCT_NAME = Target.the("nombre del producto en el carrito")
            .located(By.cssSelector(".inventory_item_name"));
}
