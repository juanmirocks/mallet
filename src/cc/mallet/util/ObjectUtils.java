package cc.mallet.util;


public final class ObjectUtils {

    // See also Guava's Objects.equal(Object, Object)
    public static boolean equal(final Object lhs, final Object rhs) {
        if (null == lhs) {
            return (null == rhs);
        } else {
            return lhs.equals(rhs);
        }
    }

    private ObjectUtils() {
        // prevent external instantiation
    }

}
