package stream.collectors;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsBasic {

    public static void main(String[] args) {
        // 기본기능
        List<String> list = Stream.of("JAVA", "spring", "JPA")
                .collect(Collectors.toList());
        System.out.println("list = " + list);   // 수정 가능 리스트 반환

        // 수정 불가능 리스트
        List<Integer> unmodifiableList = Stream.of(1, 2, 3)
                .collect(Collectors.toUnmodifiableList());
//        unmodifiableList.add(1);  // error
        System.out.println("unmodifiableList = " + unmodifiableList);

        Set<Integer> set = Stream.of(1, 2, 3, 3, 3, 4, 2, 2, 1)
                .collect(Collectors.toSet());
        System.out.println("set = " + set);


    }
}
