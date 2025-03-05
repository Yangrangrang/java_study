package collection.iterable;

import java.util.Iterator;

public class MyArrayMain {

    public static void main(String[] args) {
        MyArray myArray = new MyArray(new int[]{1, 2, 3, 4});

        Iterator<Integer> iterator = myArray.iterator();
        System.out.println("iterator 사용");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 추가
        System.out.println("for-each 사용");
        for (Integer value : myArray) { // 향상된 for문은 iterable 을 가지고 있어야 한다. 컴파일시 코드를 변경함.
            System.out.println("value = " + value);
        }
    }
}
