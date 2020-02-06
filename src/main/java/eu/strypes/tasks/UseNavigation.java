package eu.strypes.tasks;

import eu.strypes.user_interface.NavigationDropdownItem;
import eu.strypes.user_interface.NavigationItem;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

public class UseNavigation implements Task {
    private final String parentItemName;
    private final String childItemName;

    public static NavigationBuilder from(String parentItem) {
        return new NavigationBuilder().setParentItem(parentItem);
    }

    public UseNavigation(String parentItemName, String childItemName) {
        this.parentItemName = parentItemName;
        this.childItemName = childItemName;
    }

    @Override
    @Step("{0} navigates: #parentItemName > #childItemName")
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(
            Click.on(NavigationItem.withName(parentItemName)),
            Click.on(NavigationDropdownItem.withName(childItemName))
        );
    }

    public static class NavigationBuilder {
        private String parentItem;

        public NavigationBuilder setParentItem(String parentItem) {
            this.parentItem = parentItem;
            return this;
        }

        public UseNavigation to(String childItem) {
            return Tasks.instrumented(UseNavigation.class, this.parentItem, childItem);
        }
    }
}
