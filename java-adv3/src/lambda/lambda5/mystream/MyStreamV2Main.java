package lambda.lambda5.mystream;

import java.util.List;

public class MyStreamV2Main {

    public static void main(String[] args) {
        // 짝수만 남기고 남은값의 두배 반환
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> result = MyStreamV2.of(numbers)
                .filter(number -> number % 2 == 0)
                .map(number -> number * 2)
                .toList();

        System.out.println("result = " + result);

        List<Integer> result2 = MyStreamV2.of(numbers)
                .map(n -> n * 2)
                .toList();

        System.out.println("result2 = " + result2);
    }

}
