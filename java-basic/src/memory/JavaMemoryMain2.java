package memory;

/*
main -> method1 -> method2  : 순으로 호출
method1 에서 Data 클래스 인스턴스 생성
method1 에서 method2 를 호출할 때 매개변수에 Data 인스턴스의 참조값을 전달
 */
public class JavaMemoryMain2 {

    public static void main(String[] args) {
        System.out.println("main start");
        method1();
        System.out.println("main end");
    }

    static void method1() {
        System.out.println("method1 start");
        Data data1 = new Data(10);
        method2(data1);
        System.out.println("method1 end");
    }

    static void method2(Data data2) {
        System.out.println("method2 start");
        System.out.println("data2.get = " + data2.getValue());
        System.out.println("method2 end");
    }
}
