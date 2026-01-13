package lambda.lambda4;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * 의도를 명시적으로 드러내기 위한 함수형 인터페이스
 */
public class PredicateMain {

    public static void main(String[] args) {
        Predicate<Integer> predicate1 = new Predicate<Integer>() {

            @Override
            public boolean test(Integer value) {
                return value % 2 == 0;
            }
        };

        System.out.println("predicate1.test(10) = " + predicate1.test(10));

        Predicate<Integer> predicate2 = x -> x % 2 == 0;
        System.out.println("predicate2.test(10) = " + predicate2.test(10));

        // Function 을 쓸수 있는데, 왜 Predicate 를 써야하는가?
        // Predicate 를 쓰면 "이 함수는 조건을 검사하거나 필터링 용도 쓰인다" 라는 의도 분명
        Function<Integer, Boolean> function1 = x -> x % 2 == 0;
        System.out.println("function1.apply(10) = " + function1.apply(10));
    }
}
