package eu.strypes.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class NavigationDropdownItem {

    public static Target withName(String name) {
        return Target.the(name).located(By.xpath(String.format("//a[contains(text(), '%s')]", name)));
    }
}
