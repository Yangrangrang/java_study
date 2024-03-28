package org.example.ch11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * ArrayList vs. LinkedList - 성능 비교
 * 접근 시간 (access time) - ArrayList가 빠름
 */
public class ArrayListLinkedListTest2 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList(1000000);
        LinkedList ll = new LinkedList();
        add(al);
        add(ll);

        System.out.println("= 접근시간 테스트 =");
        System.out.println("ArrayList :"+access(al));
        System.out.println("LinkedList :"+access(ll));
    }

    public static void add(List list) {
        for (int i = 0; i < 100000; i++) list.add(i + "");
    }

    public static long access(List list) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) list.get(i);

        long end = System.currentTimeMillis();

        return end - start;
    }

    // = 접근시간 테스트 =
    // ArrayList :0
    // LinkedList :185
}
