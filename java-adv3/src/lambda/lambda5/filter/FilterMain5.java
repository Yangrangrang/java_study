package lambda.lambda5.filter;

import java.util.List;

public class FilterMain5 {

    public static void main(String[] args) {
        // 숫자 사용 필터
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = GenericFilter.filter(numbers, n1 -> n1 % 2 == 0);
        System.out.println("evenNumbers = " + evenNumbers);

        // 문자 사용 필터
        List<String> strings = List.of("a", "bb", "ccc");
        List<String> results = GenericFilter.filter(strings, n -> n.length() >= 2);
        System.out.println("results = " + results);

        List<String> results2 = GenericFilter.filter(strings, n -> n.equals("a"));
        System.out.println("results2 = " + results2);

        List<String> results3 = GenericFilter.functionFilter(strings, n -> n.length() >= 3);
        System.out.println("results3 = " + results3);

        List<String> results4 = GenericFilter.functionFilter(strings, n -> n.length() >= 4);
        System.out.println("results4 = " + results4);
    }

}
