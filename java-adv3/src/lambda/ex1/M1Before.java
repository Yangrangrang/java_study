package lambda.ex1;

public class M1Before {

    public static void greet(String string) {
        System.out.println("===시작===");
        System.out.println(string);
        System.out.println("===끝===");
    }

    public static void greetMorning() {
        System.out.println("===시작===");
        System.out.println("M1Before.greetMorning");
        System.out.println("===끝===");
    }

    public static void greetAfternoon() {
        System.out.println("===시작===");
        System.out.println("M1Before.greetAfternoon");
        System.out.println("===끝===");
    }

    public static void greetEvening() {
        System.out.println("===시작===");
        System.out.println("M1Before.greetEvening");
        System.out.println("===끝===");
    }

    public static void main(String[] args) {
        greetMorning();
        greetAfternoon();
        greetEvening();
    }
}
