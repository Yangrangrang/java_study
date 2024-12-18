package lang.string;

public class StringConcatMain {

    public static void main(String[] args) {
        String a = "hello";
        String b = " java";

        String result1 = a.concat(b);
        String result2 = a + b; // 너무 자주 써서 자바 언어에서 편의상 특별히 + 연산을 제공함.

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
