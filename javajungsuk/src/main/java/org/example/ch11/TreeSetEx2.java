package org.example.ch11;

import java.util.TreeSet;

public class TreeSetEx2 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        int[] score = {80, 95, 50, 35, 45, 65, 10, 100};

        for (int i = 0; i < score.length; i++) {
            set.add(new Integer(score[i]));
        }

        System.out.println(set.headSet(new Integer(50)));   // [10, 35, 45] SortedSet.headSet(toElement) toElement 보다 작은 수 반환
        System.out.println(set.tailSet(new Integer(50)));   // [50, 65, 80, 95, 100] SortedSet.tailSet(toElement) toElement 보다 크거나 같은 수 반환
    }
}
