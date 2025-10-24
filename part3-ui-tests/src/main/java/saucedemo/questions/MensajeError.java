package saucedemo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.WebElement;
import saucedemo.userinterfaces.LoginPage;

public class MensajeError implements Question<String> {

    private final Target target;

    public MensajeError(Target target) {
        this.target = target;
    }

    public static MensajeError seMuestra() {
        return new MensajeError(LoginPage.ERROR_MESSAGE);
    }

    @Override
    public String answeredBy(Actor actor) {
        WebElement element = target.resolveFor(actor);
        return element.getText();
    }
}
