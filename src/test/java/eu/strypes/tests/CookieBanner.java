package eu.strypes.tests;

import eu.strypes.base.BaseTest;
import eu.strypes.interactions.Refresh;
import eu.strypes.questions.TheCookieBanner;
import eu.strypes.tasks.CloseTheCookie;
import org.junit.Test;

import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.Matchers.equalTo;

public class CookieBanner extends BaseTest {

    @Test
    public void closeCookieBanner() {
        givenThat(peter).attemptsTo(CloseTheCookie.banner());
        then(peter).should(
            eventually(seeThat(TheCookieBanner.isPresent(), equalTo(false)))
        );

        when(peter).attemptsTo(Refresh.theCurrentPage());
        then(peter).should(
            seeThat(TheCookieBanner.isPresent(), equalTo(false))
        );
    }
}
