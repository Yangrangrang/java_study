package lambda.ex1;

public class M1After {

    public static void greet(String string) {
        System.out.println("===시작===");
        System.out.println(string);
        System.out.println("===끝===");
    }

    public static void main(String[] args) {
        greet("morning");
        greet("afternoon");
        greet("evening");
    }
}
