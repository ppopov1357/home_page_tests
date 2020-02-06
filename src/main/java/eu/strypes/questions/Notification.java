package eu.strypes.questions;

import eu.strypes.user_interface.HomePage;

public class Notification {

    public static NotificationQuestion ofSuccess() {
        return new NotificationQuestion(HomePage.SUCCESS_NOTIFICATIONS);
    }

    public static NotificationQuestion ofError() {
        return new NotificationQuestion(HomePage.ERROR_NOTIFICATIONS);
    }

}
