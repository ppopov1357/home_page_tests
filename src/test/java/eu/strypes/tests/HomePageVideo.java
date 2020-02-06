package eu.strypes.tests;

import eu.strypes.base.BaseTest;
import eu.strypes.questions.TheCssClass;
import eu.strypes.user_interface.HomePage;
import net.serenitybdd.screenplay.actions.Click;
import org.junit.Test;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.Matchers.equalTo;

public class HomePageVideo extends BaseTest {

    @Test
    public void clickingTheVideoCoverRevealsTheActualVideo() {
        when(peter).attemptsTo(Click.on(HomePage.VIDEO_COVER));
        then(peter).should(
            seeThat(
                TheCssClass.of(HomePage.VIDEO_COVER).named("reveal-video").isPresent(),
                equalTo(true)
            )
        );
    }
}
