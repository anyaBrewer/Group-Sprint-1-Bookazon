public final class ValidationUtils {
    private ValidationUtils() {} 

    public static boolean isNonEmpty(String s) {
        return s != null && !s.isBlank();
    }
}
