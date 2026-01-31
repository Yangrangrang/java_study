package lambda.lambda5.map;

import java.beans.beancontext.BeanContext;
import java.util.Arrays;
import java.util.List;

public class MapMainV5 {

    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "orange", "pineapple");

        // String -> String
        List<String> upper = GenericMapper.map(fruits, s -> s.toUpperCase());
        System.out.println("upper = " + upper);

        // String -> Integer
        List<Integer> length = GenericMapper.map(fruits, s -> s.length());
        System.out.println("length = " + length);

        // Integer -> String
        List<Integer> list = List.of(1, 2, 3);
        List<String> starList = GenericMapper.map(list, n -> "*".repeat(n));
        System.out.println("starList = " + starList);

        // String -> Boolean
        List<Boolean> booleans = GenericMapper.map(fruits, s -> s.length() > 3);
        System.out.println("booleans = " + booleans);

        List<Boolean> test = GenericMapper.map(list, n -> n % 2 == 0);
        System.out.println("test = " + test);
    }
}
