package org.example.ch11;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx5 {
    public static void main(String[] args) {
        HashSet setA = new HashSet();
        HashSet setB = new HashSet();
        HashSet setHab = new HashSet();
        HashSet setKyo = new HashSet();
        HashSet setCha = new HashSet();

        setA.add("1");
        setA.add("2");
        setA.add("3");
        setA.add("4");
        setA.add("5");

        System.out.println("A = " + setA);      // A = [1, 2, 3, 4, 5]

        setB.add("4");
        setB.add("5");
        setB.add("6");
        setB.add("7");
        setB.add("8");

        System.out.println("B = " + setB);      // B = [4, 5, 6, 7, 8]

        Iterator it = setB.iterator();
        while (it.hasNext()) {
            Object tmp = it.next();
            if(setA.contains(tmp))      // contains 객체들이 포함되어있는지 확인
                // 포함되어있으면 setKyo에 추가
                setKyo.add(tmp);
        }

        it = setA.iterator();
        while (it.hasNext()) {
            Object tmp = it.next();
            if (!setB.contains(tmp))
                setCha.add(tmp);
        }

        it = setA.iterator();
        while (it.hasNext()) {
            setHab.add(it.next());
        }

        it = setB.iterator();
        while (it.hasNext()) {
            setHab.add(it.next());
        }



        System.out.println("A ∩ B = "+setKyo);  // A ∩ B = [4, 5]
        System.out.println("A ∪ B = "+setHab);  // A ∪ B = [1, 2, 3, 4, 5, 6, 7, 8]
        System.out.println("A - B = "+setCha);  // A - B = [1, 2, 3]
    }
}
