package collection.compare;

import java.util.Arrays;
import java.util.Comparator;

public class SortMain2 {

    public static void main(String[] args) {
        Integer[] arr = {3, 2, 1};
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        System.out.println("Comparator 비교");
        Arrays.sort(arr, new AscComparator());
        System.out.println("AscComparator: " + Arrays.toString(arr));

        Arrays.sort(arr, new DescComparator());
        System.out.println("DescComparator: " + Arrays.toString(arr));

        Arrays.sort(arr, new AscComparator().reversed());   // DescComparator와 같다.
        System.out.println("AscComparator: " + Arrays.toString(arr));
    }

    static class AscComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            System.out.println("o1 = " + o1 + " o2 = " + o2);
            return (o1 < o2) ? -1 : ((o1 == o2) ? 0 : 1);
        }
    }

    static class DescComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            System.out.println("o1 = " + o1 + " o2 = " + o2);
            return (o1 < o2) ? -1 : ((o1 == o2) ? 0 : 1) * -1;
        }
    }
}
