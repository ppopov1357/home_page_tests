package eu.strypes.user_interface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BasePage extends PageObject {
    public static Target title = Target.the("Page title").located(By.tagName("h1"));
}
