package lambda.lambda4;

public class RunnableMain {

    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            public void run() {
                System.out.println("Hello World");
            }
        };
        runnable.run();

        Runnable runnable1 = () -> System.out.println("Hello World");
        runnable1.run();
    }
}
