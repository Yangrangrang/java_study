package collection.iterable;

import java.util.*;

public class JavaIterableMain {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        printAll(list.iterator());
        foreach(list);

        Set<Integer> set = new HashSet<>();
        set.add(13);
        set.add(24);
        set.add(32);
        printAll(set.iterator());
        foreach(set);

        Map<Integer, Integer> map = new HashMap<>();
        map.put(11, 11);
        map.put(22, 21);
        map.put(33, 31);
        Collection<Integer> values = map.values();
        printAll(values.iterator());

        Set<Integer> integers = map.keySet();
        printAll(integers.iterator());

        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

    private static void foreach(Iterable<Integer> iterable) {
        System.out.println("iterable.getClass() = " + iterable.getClass());
        for (Integer i : iterable) {
            System.out.println(i);
        }
    }

    private static void printAll(Iterator<Integer> iterator) {
        System.out.println("iterator.getClass() = " + iterator.getClass());
        while (iterator.hasNext()) {
            System.out.println("iterator.next() = " + iterator.next());
        }
    }
}
