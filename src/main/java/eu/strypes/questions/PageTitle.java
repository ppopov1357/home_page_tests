package eu.strypes.questions;

import eu.strypes.user_interface.BasePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.ValueOf;
import net.serenitybdd.screenplay.targets.Target;

public class PageTitle implements Question<String> {
    private Target pageTitle;

    public static PageTitle get() {
        return new PageTitle(BasePage.title);
    }

    @Override
    public String answeredBy(Actor actor) {
        return ValueOf.the(Text.of(pageTitle).viewedBy(actor));
    }

    public PageTitle(Target pageTitle) {
        this.pageTitle = pageTitle;
    }
}
