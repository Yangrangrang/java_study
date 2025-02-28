package collection.set.javaset;

import java.util.*;

public class JavaSetMain {

    public static void main(String[] args) {

        run(new HashSet<>());       // 입력한 순서를 보장하지 않는다.
        run(new LinkedHashSet<>()); // 입력한 순서를 정확히 보장한다.
        run(new TreeSet<>());       // 데이터 값을 기준으로 정렬한다.
    }

    private static void run(Set<String> set) {
        System.out.println("set.getClass() = " + set.getClass());

        set.add("C");
        set.add("B");
        set.add("A");
        set.add("1");
        set.add("2");
        System.out.println("set = " + set);

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}
