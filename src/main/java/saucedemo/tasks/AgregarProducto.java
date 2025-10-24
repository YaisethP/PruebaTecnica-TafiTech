package saucedemo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import saucedemo.userinterfaces.ProductsPage;

public class AgregarProducto implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ProductsPage.FIRST_PRODUCT_ADD_BUTTON),
                Click.on(ProductsPage.CART_ICON)
        );
    }

    public static AgregarProducto alCarrito() {
        return new AgregarProducto();
    }
}
