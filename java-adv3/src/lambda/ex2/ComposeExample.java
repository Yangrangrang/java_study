package lambda.ex2;

public class ComposeExample {

    public static MyTransformer compose(MyTransformer first, MyTransformer second) {
        return s -> first.transform(second.transform(s));
    }

    public static void main(String[] args) {
        MyTransformer toUpper = s -> s.toUpperCase();

        MyTransformer addDeco = s -> "**" + s + "**";

        MyTransformer composeFunc = compose(toUpper, addDeco);

        String result = composeFunc.transform("hello");
        System.out.println("result = " + result);
    }
}
