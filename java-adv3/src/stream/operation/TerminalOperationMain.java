package stream.operation;

import java.util.List;
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
    }
}
