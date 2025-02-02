package generic.ex1;

public class BoxMain2 {

    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Integer integer = (Integer) integerBox.get();
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("Hello");
        String string = (String) stringBox.get();
        System.out.println("string = " + string);

        // 잘못된 타입의 인수 전달시
        integerBox.set("문제100");
        Integer result = (Integer) integerBox.get();    // String -> Integer 캐스팅 예외 (ClassCastException)
        System.out.println("result = " + result);
    }
}
