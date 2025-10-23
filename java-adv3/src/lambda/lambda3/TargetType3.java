package lambda.lambda3;

import java.util.function.Function;

// 자바가 기본으로 제공하는 Function 대입
public class TargetType3 {

    public static void main(String[] args) {
        // 람다 직접 대입: 문제 없음
        Function<Integer, String> function = i -> "value = " + i;
        System.out.println("function.apply(10) = " + function.apply(10));

        Function<Integer, String> function2 = function;
        System.out.println("function2.apply(20) = " + function2.apply(20));
    }
}
