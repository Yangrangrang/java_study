package org.example.ch11;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Comparator 인터페이스는 두 개의 객체를 비교하여 순서를 정하는 방법을 정의하는 인터페이스입니다
 */
public class ComparatorEx {
    public static void main(String[] args) {
        String[] strArr = {"cat", "Dog", "lion", "tiger"};

        Arrays.sort(strArr);    // String의 Comparable 구현에 의한 정렬
        System.out.println("strArr=" + Arrays.toString(strArr));    // strArr=[Dog, cat, lion, tiger]

        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // 대소문자 구분 안함
        System.out.println("strArr=" + Arrays.toString(strArr));    // strArr=[cat, Dog, lion, tiger]

        Arrays.sort(strArr, new Descending());  // 역순 정렬
        System.out.println("strArr=" + Arrays.toString(strArr));    // strArr=[tiger, lion, cat, Dog]
    }
}

class Descending implements Comparator {

    public int compare(Object o1, Object o2) {  // 두 객체를 비교하여 역순으로 정렬하는데 사용
        if (o1 instanceof Comparable && o2 instanceof Comparable) {     // 두 객체가 Comparable 인터페이스를 구현하고 있는지 확인하는 것
            Comparable c1 = (Comparable) o1;
            System.out.println(c1.toString());
            Comparable c2 = (Comparable) o2;
            System.out.println(c2.toString());
            return c1.compareTo(c2) * -1;   // -1을 곱해서 기본 정렬방식의 역으로 변경한다.
                                            // 또는 c2.compareTo(c1)와 같이 순서를 바꿔도 된다.
        }
        return -1;
    }
}
