package lambda.lambda5.mystream;

import java.util.List;

public class MyStreamV1Main {

    public static void main(String[] args) {
        // 짝수만 남기고 남은값의 두배 반환
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        returnValue(numbers);

    }

    private static void returnValue(List<Integer> numbers) {
        MyStreamV1 stream = new MyStreamV1(numbers);
        MyStreamV1 filtered = stream.filter(n -> n % 2 == 0);
        System.out.println("filtered = " + filtered.toList());
        MyStreamV1 mapped = filtered.map(n -> n * 2);
        System.out.println("mapped = " + mapped.toList());
        List<Integer> result = mapped.toList();
        System.out.println("result = " + result);
    }

    private static void methodChain(List<Integer> numbers) {
        List<Integer> result =  new MyStreamV1(numbers)
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .toList();
        System.out.println("result = " + result);
    }
}
