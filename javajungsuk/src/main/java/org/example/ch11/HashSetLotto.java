package org.example.ch11;

import java.util.*;

public class HashSetLotto {
    public static void main(String[] args) {
        Set set = new HashSet();

        for (int i = 0; set.size() < 6; i++) {
            int num = (int) (Math.random() * 45) + 1;
            set.add(new Integer(num));
        }

        List list = new LinkedList(set);        // LinkedList(Collection c)
        Collections.sort(list);                 // Collections.sort(List list)
        System.out.println(set);    // [3, 5, 39, 25, 10, 29]
        System.out.println(list);   // [3, 5, 10, 25, 29, 39]

    }
}
