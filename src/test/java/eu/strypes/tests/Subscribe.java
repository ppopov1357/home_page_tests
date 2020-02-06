package eu.strypes.tests;

import eu.strypes.base.BaseTest;
import eu.strypes.questions.Notification;
import eu.strypes.tasks.SubscribeWith;
import eu.strypes.utils.Random;
import org.junit.Test;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.Matchers.equalTo;

public class Subscribe extends BaseTest {

    @Test
    public void subscribeWithValidEmail() {
        when(peter).attemptsTo(SubscribeWith.email(Random.validEmail()));
        then(peter).should(
            seeThat(Notification.ofSuccess(), equalTo("Thanks for subscribing!"))
        );
    }

    @Test
    public void attemptToSubscribeWithEmptyEmail() {
        when(peter).attemptsTo(SubscribeWith.email(""));
        then(peter).should(
            seeThat(Notification.ofError(), equalTo("Please enter a valid email."))
        );
    }
}
