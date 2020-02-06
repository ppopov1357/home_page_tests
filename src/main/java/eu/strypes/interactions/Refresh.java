package eu.strypes.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Step;

public class Refresh implements Interaction {

    public static Refresh theCurrentPage() {
        return Tasks.instrumented(Refresh.class);
    }


    @Override
    @Step("{} refreshes the current page")
    public <T extends Actor> void performAs(T actor) {
        BrowseTheWeb.as(actor).getDriver().navigate().refresh();
    }
}
