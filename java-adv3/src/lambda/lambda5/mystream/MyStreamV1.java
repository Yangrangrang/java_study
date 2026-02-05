package lambda.lambda5.mystream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MyStreamV1 {

    private static List<Integer> internalList;

    public MyStreamV1(List<Integer> internalList) {
        this.internalList = internalList;
    }

    public MyStreamV1 filter(Predicate<Integer> predicate) {
        List<Integer> filtered = new ArrayList<>();
        for (Integer element : internalList) {
            if (predicate.test(element)) {
                filtered.add(element);
            }
        }
        return new MyStreamV1(filtered);
    }
}
