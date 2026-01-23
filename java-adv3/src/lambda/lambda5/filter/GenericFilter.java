package lambda.lambda5.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class GenericFilter {

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filtered = new ArrayList<>();
        for (T item : list) {
            if (predicate.test(item)) {
                filtered.add(item);
            }
        }
        return filtered;
    }

    public static <T, U> U filter(List<T> list, Function<T, U> function, Predicate<T> predicate) {
        for (T item : list) {
            U result = function.apply(item);
            if (result != null) {
                return result;
            }
        }
        return null;
    }


}
