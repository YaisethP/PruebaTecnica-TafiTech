package saucedemo.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class EscribirTexto implements Interaction {

    private final Target campo;
    private final String texto;

    public EscribirTexto(Target campo, String texto) {
        this.campo = campo;
        this.texto = texto;
    }

    public static EscribirTexto en(Target campo, String texto) {
        return new EscribirTexto(campo, texto);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(texto).into(campo)
        );
    }
}
