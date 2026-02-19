package methodRef.start;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class MethodRefStartV3 {

    public static void main(String[] args) {
        BinaryOperator<Integer> add1 = MethodRefStartV3::add;   // (a, b) -> add(a, b)
        BinaryOperator<Integer> add2 = MethodRefStartV3::add;   // (a, b) -> add(a, b)

        Integer result1 = add1.apply(1, 2);
        System.out.println("result1 = " + result1);

        Integer result2 = add2.apply(1, 2);
        System.out.println("result2 = " + result2);

        Consumer<Integer> print = MethodRefStartV3::print;
        print.accept(result1);

    }

    static int add(int a, int b) {
        return a + b;
    }

    static void print(int a) {
        System.out.println(a);
    }
}
