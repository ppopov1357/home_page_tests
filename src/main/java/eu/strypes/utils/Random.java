package eu.strypes.utils;

public class Random {

    public static String validEmail() {
        return "randomEmail" + System.currentTimeMillis() + "@randomDomain.com";
    }
}
