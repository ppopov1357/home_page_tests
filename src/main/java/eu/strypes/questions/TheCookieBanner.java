package eu.strypes.questions;

import eu.strypes.user_interface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

@Subject("The cookie banner is present:")
public class TheCookieBanner implements Question<Boolean> {

    public static TheCookieBanner isPresent() {
        return new TheCookieBanner();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return HomePage.COOKIE_BANNER.resolveFor(actor).isCurrentlyVisible();
    }
}
