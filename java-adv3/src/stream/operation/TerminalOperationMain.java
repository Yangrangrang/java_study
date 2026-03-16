package stream.operation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOperationMain {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10);

        // Collectors는 뒤에서 더 자세히 (복잡한 수집이 필요할때 사용)
        System.out.println("1. collect- List 수집");
        List<Integer> evenNumbers1 = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("짝수 리스트: " + evenNumbers1);
        System.out.println();

        System.out.println("2. toList() -  JAVA 16 + ");
        List<Integer> evenNumbers2 = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println("짝수 리스트: " + evenNumbers1);
        System.out.println();

        System.out.println("3. toArray -  배열로 반환 ");
        Integer[] arr = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toArray(Integer[]::new);
        System.out.println("짝수 배열: " + Arrays.toString(arr));
        System.out.println();

        System.out.println("4. forEach - 각요소 처리");
        numbers.stream()
                .limit(5)
                .forEach(n -> System.out.print(n + " "));
        System.out.println("\n");

        System.out.println("5. count - 요소 개수");
        long count = numbers.stream()
                .filter(n -> n > 5)
                .count();
        System.out.println("보다 큰 숫자 개수 = " + count);
        System.out.println("\n");

        System.out.println("6. reduce - 요소들의 합");
        System.out.println("초기값이 없는 reduce");
        Optional<Integer> sum1 = numbers.stream()
                .reduce((a, b) -> a + b);
        System.out.println("합계 (초기값 없음) = " + sum1.get());

        System.out.println("초기값이 있는 reduce");
        int sum2 = numbers.stream()
                .reduce(100, (a, b) -> a + b);
        System.out.println("합계 (초기값 없음) = " + sum2);
    }
}
