package static2.ex;

import static static2.ex.MathArrayUtils.*;  // static import

public class MathArrayUtilsMain {

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        System.out.println("sum=" + sum(values));
        System.out.println("sum=" + average(values));
        System.out.println("sum=" + min(values));
        System.out.println("sum=" + max(values));
    }
}
