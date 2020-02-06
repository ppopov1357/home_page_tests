package eu.strypes.base;

import eu.strypes.user_interface.HomePage;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public abstract class BaseTest {

    // represent an user of the Strypes website, and later is used in the reports
    public Actor peter = Actor.named("Peter");

    @Managed
    public WebDriver browser;

    @Before
    public void setUpBrowseTheWebAbility() {
        // the user has the ability to browse the web with a browser
        peter.can(BrowseTheWeb.with(browser));
        // All of the tests start on Strypes home page
        peter.wasAbleTo(Open.browserOn().the(HomePage.class));
    }
}
