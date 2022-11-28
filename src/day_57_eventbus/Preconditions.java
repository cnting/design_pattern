package day_57_eventbus;

public class Preconditions {
    public static Object checkNotNull(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("obj is Null");
        }
        return obj;
    }

    public static void checkArgument(boolean result, String msg, Object... param) {
        if (!result) {
            throw new IllegalArgumentException(String.format(msg, param));
        }
    }
}
