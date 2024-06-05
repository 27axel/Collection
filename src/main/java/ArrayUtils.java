import java.util.HashMap;
import java.util.Map;

public class ArrayUtils {
    public static <T> Map<T, Integer> countElements(T[] array) {
        Map<T, Integer> counts = new HashMap<>();
        for (T element : array) {
            counts.put(element, counts.getOrDefault(element, 0) + 1);
        }
        return counts;
    }
}
