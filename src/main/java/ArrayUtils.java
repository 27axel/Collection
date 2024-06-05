import java.lang.reflect.Array;

public class ArrayUtils {
    public static <T> T[] filter(T[] array, Filter filter, Class<T> tClass) {
        T[] filteredArray = (T[]) Array.newInstance(tClass, array.length);

        for (int i = 0; i < array.length; i++) {
            filteredArray[i] = (T) filter.apply(array[i]);
        }

        return filteredArray;
    }
}
