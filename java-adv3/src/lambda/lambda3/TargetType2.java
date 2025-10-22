package lambda.lambda3;

import java.util.function.Function;

// 자바가 기본 제공하는 Function사용
public class TargetType2 {

    public static void main(String[] args) {
        Function<String, String> upperCase = s -> s.toUpperCase();
        String result = upperCase.apply("value");
        System.out.println("result = " + result);

        Function<Integer, Integer> square = n -> n * n;
        Integer result2 = square.apply(5);
        System.out.println("result2 = " + result2);
    }
}
