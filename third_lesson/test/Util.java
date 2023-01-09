package third_lesson.test;

public static class Util {
    
    public static <T> T getValue(Object obj, Class<T> clazz) {
        return (T) obj;
    }
    public static <T> T getValue(Object obj) {
        return (T) obj;
    }
}

