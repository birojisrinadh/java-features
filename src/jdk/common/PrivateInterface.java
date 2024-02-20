package jdk.common;

public interface PrivateInterface {

    default boolean isDefaultMethod() {
        return checkBoolean(true);
    }

    static boolean isStaticMethod() {
        return checkStaticBoolean(true);
    }

    private boolean checkBoolean(boolean value) {
        return value;
    }

    private static boolean checkStaticBoolean(boolean value) {
        return value;
    }
}
