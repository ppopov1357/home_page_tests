package eu.strypes.tasks;

import eu.strypes.user_interface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class CloseTheCookie implements Task {

    public static CloseTheCookie banner() {
        return new CloseTheCookie();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePage.CLOSE_COOKIE_MESSAGE));
    }
}
