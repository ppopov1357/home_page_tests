package eu.strypes.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

@Subject("Notification with text")
public class NotificationQuestion implements Question<String> {

    private final Target notificationTarget;

    public NotificationQuestion(Target notificationTarget) {
        this.notificationTarget = notificationTarget;
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(notificationTarget).viewedBy(actor).resolve();
    }

}
