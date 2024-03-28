package org.example.ch11;

import java.util.Arrays;

/**
 * 배열 복사 - copyOf(), copyOfRange()
 * 배열 채우기 = fill(), setAll()
 * 문자열의 비교, 출력(일차원 배열) - equals(), toString()
 *                 (다차원 배열) - deepEquals(), deepToString()
 * 배열 정렬, 검색 - sort(), binarySearch()
 * binarySearch() - 반드시 배열이 정렬된 상태여야 올바른 결과를 얻는다.
 */
public class ArraysEx {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[][] arr2D = {{11, 12, 13}, {21, 22, 23}};

        System.out.println("arr="+ Arrays.toString(arr));           // arr=[0, 1, 2, 3, 4]
        System.out.println("arr2D="+Arrays.deepToString(arr2D));    // arr2D=[[11, 12, 13], [21, 22, 23]]

        int[] arr2 = Arrays.copyOf(arr, arr.length);
        int[] arr3 = Arrays.copyOf(arr, 3);
        int[] arr4 = Arrays.copyOf(arr, 7);
        int[] arr5 = Arrays.copyOfRange(arr, 2, 4);
        int[] arr6 = Arrays.copyOfRange(arr, 0, 7);

        System.out.println("arr2="+ Arrays.toString(arr2));     // arr2=[0, 1, 2, 3, 4]
        System.out.println("arr3="+ Arrays.toString(arr3));     // arr3=[0, 1, 2]
        System.out.println("arr4="+ Arrays.toString(arr4));     // arr4=[0, 1, 2, 3, 4, 0, 0]
        System.out.println("arr5="+ Arrays.toString(arr5));     // arr5=[2, 3]
        System.out.println("arr6="+ Arrays.toString(arr6));     // arr6=[0, 1, 2, 3, 4, 0, 0]

        int[] arr7 = new int[5];
        Arrays.fill(arr7, 9);
        System.out.println("arr7="+Arrays.toString(arr7));  // arr7=[9, 9, 9, 9, 9]

        Arrays.setAll(arr7, i -> (int) (Math.random() * 6) + 1);
        System.out.println("arr7="+Arrays.toString(arr7));  // arr7=[5, 5, 3, 1, 4]

        for (int i : arr7) {
            char[] graph = new char[i];
            Arrays.fill(graph, '*');
            System.out.println(new String(graph)+i);
        }

        // *****5
        // *****5
        // ***3
        // *1
        // ****4

        String[][] str2D  = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};
        String[][] str2D2 = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};

        System.out.println(Arrays.equals(str2D, str2D2));      // false
        System.out.println(Arrays.deepEquals(str2D, str2D2));  // true

        char[] chArr = { 'A', 'D', 'C',  'B', 'E' };

        int idx = Arrays.binarySearch(chArr, 'B');
        System.out.println("chArr="+Arrays.toString(chArr));    // chArr=[A, D, C, B, E]
        System.out.println("index of B ="+Arrays.binarySearch(chArr, 'B')); // index of B =-2
        System.out.println("= After sorting =");
        Arrays.sort(chArr);
        System.out.println("chArr="+Arrays.toString(chArr));    // chArr=[A, B, C, D, E]
        System.out.println("index of B ="+Arrays.binarySearch(chArr, 'B')); // index of B =1
    }
}

