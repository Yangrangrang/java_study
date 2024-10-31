package ref;

public class MethodChange1 {

    public static void main(String[] args) {

        int a = 10;
        System.out.println("메소드 호출 전 a = " + a);
        changePrimitive(a);
        System.out.println("메소드 호출 후 a = " + a);    // 자바에서는 항상 복수해서 대입한다.
    }

    static void changePrimitive(int x) {
        x = 20;
    }
}
