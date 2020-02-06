package eu.strypes.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("page:home.page")
public class HomePage extends BasePage {
    public static final Target VIDEO_COVER = Target.the("Video cover").located(By.className("video-cover"));

    public static final Target SUBSCRIBE_INPUT = Target.the("Subscribe input").located(By.cssSelector("input[name='email']"));

    public static final Target SUCCESS_NOTIFICATIONS = Target.the("Success notification").located(By.className("toast-success"));
    public static final Target ERROR_NOTIFICATIONS = Target.the("Error notification").located(By.className("toast-error"));

    public static final Target COOKIE_BANNER = Target.the("Cookie Banner").located(By.cssSelector("div[aria-label='cookieconsent']"));

    public static final Target CLOSE_COOKIE_MESSAGE = Target.the("Close cookie message btn").located(By.cssSelector("a[aria-label='dismiss cookie message']"));

}
