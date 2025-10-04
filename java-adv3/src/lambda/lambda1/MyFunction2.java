package lambda.lambda1;

import lambda.MyFunction;

public class MyFunction2 {
    public static void main(String[] args) {
        MyFunction myFunction1 = (a, b) -> {
            return a + b;
        };

        int apply = myFunction1.apply(1, 2);
        System.out.println(apply);
    }

}
