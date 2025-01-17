package nested.local;

public class LocalOuterV1 {

    private int outInstanceVar = 3;

    public void process(int paramVar) {
        int localVar = 1;

        class LocalPrinter {    // 지역 클래스는 지역 변수처럼 접근제어자를 사용X
            int value = 0;

            public void printData() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        LocalPrinter printer = new LocalPrinter();
        printer.printData();
    }

    public static void main(String[] args) {
        LocalOuterV1 localOuterV1 = new LocalOuterV1();
        localOuterV1.process(2);
    }
}
