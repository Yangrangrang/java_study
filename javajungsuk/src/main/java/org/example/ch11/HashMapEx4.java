package org.example.ch11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * data 객체가 가지고 있는 값 counting
 */
public class HashMapEx4 {
    public static void main(String[] args) {
        String[] data = {"A", "K", "A", "K", "D", "K", "A", "K", "K", "K", "Z", "D"};

        HashMap map = new HashMap();

        for (int i = 0; i < data.length; i++) {
            System.out.println("map.containsKey(data[i]) = " + map.containsKey(data[i]));   // containsKey(o) 지정된 key객체와 일치하는 Map의 key객체가 있는지 확인
            System.out.println("data = " + data[i]);
            if (map.containsKey(data[i])) {
                // map에 이미 key객체가 있으면 기존에 value값에서 + 1
                Integer value = (Integer) map.get(data[i]);
                System.out.println("value = " + value);
                map.put(data[i], new Integer(value.intValue() + 1));
            } else {
                // map이 가지고 있지 않은 객체가 오면 map에 put(저장)
                map.put(data[i], new Integer(1));
            }
            System.out.println("map.toString() = " + map.toString());
        }

        Iterator it = map.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int value = ((Integer) entry.getValue()).intValue();
            System.out.println("value = " + value);
            System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value );
        }
    }

    public static String printBar(char ch, int value) {
        char[] bar = new char[value];

        for (int i = 0; i < bar.length; i++) {
            bar[i] = ch;
        }

        return new String(bar);     // String(char[] chArr)
    }
}
