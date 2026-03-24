package stream.collectors;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collectors2Map {

    public static void main(String[] args) {
        Map<String, Integer> map1 = Stream.of("apple", "banana", "tomato")
                .collect(Collectors.toMap(
                        name -> name,   // key
                        name -> name.length()   // value
                ));
        System.out.println("map1 = " + map1);

        // 키 중복 예외: Duplicate key apple (attempted merging values 5 and 5)
        /*
        Map<String, Integer> map2 = Stream.of("apple", "apple", "tomato")
                .collect(Collectors.toMap(
                        name -> name,   // key
                        name -> name.length()   // value
                ));
        System.out.println("map2 = " + map2);
         */

        // 키 중복 대안 (병합)
        Map<String, Integer> map3 = Stream.of("apple", "apple", "tomato")
                .collect(Collectors.toMap(
                        name -> name,   // key
                        name -> name.length(),   // value
                        (oldValue, newValue) -> oldValue + newValue // 중복 될 경우 기존값 + 새 값
                ));
        System.out.println("map3 = " + map3);

        // Map 의 타입 지정
        Map<String, Integer> map4 = Stream.of("apple", "apple", "tomato")
                .collect(Collectors.toMap(
                        name -> name,   // key
                        name -> name.length(),   // value
                        (oldValue, newValue) -> oldValue + newValue, // 중복 될 경우 기존값 + 새 값
                        LinkedHashMap::new
                ));
        System.out.println("map4 = " + map4);
        System.out.println("map4.getClass() = " + map4.getClass());

    }
}
