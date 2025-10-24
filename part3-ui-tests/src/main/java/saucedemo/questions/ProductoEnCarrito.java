package saucedemo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.WebElement;
import saucedemo.userinterfaces.CartPage;

public class ProductoEnCarrito implements Question<String> {

    private final Target target;

    public ProductoEnCarrito(Target target) {
        this.target = target;
    }

    public static ProductoEnCarrito esVisible() {
        return new ProductoEnCarrito(CartPage.PRODUCT_NAME);
    }

    @Override
    public String answeredBy(Actor actor) {
        WebElement element = target.resolveFor(actor);
        return element.getText();
    }
}
