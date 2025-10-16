package lambda.ex2;

public class BuildGreeterExample {

    // 고차 함수, greeting 문자열을 받아, "새로운 함수를" 반환
    public static StringFunction buildGreeter(String greeting) {

        return name -> greeting + ", " + name;
    }

    public static void main(String[] args) {
        StringFunction helloGreeter = buildGreeter("hello");
        StringFunction hiGreeter = buildGreeter("hi");

        String java = helloGreeter.apply("Java");
        String python = hiGreeter.apply("Python");
        System.out.println(java);
        System.out.println(python);
    }
}
