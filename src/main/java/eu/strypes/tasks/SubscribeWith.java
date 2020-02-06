package eu.strypes.tasks;

import eu.strypes.user_interface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;

public class SubscribeWith implements Task {

    private String email;

    public static Performable email(String email) {
        return Tasks.instrumented(SubscribeWith.class, email);
    }

    public SubscribeWith(String email) {
        this.email = email;
    }

    @Override
    @Step("{0} subscribes with: #email")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            SendKeys.of(email).into(HomePage.SUBSCRIBE_INPUT).thenHit(Keys.ENTER)
        );
    }
}
