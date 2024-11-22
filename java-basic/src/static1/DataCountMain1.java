package static1;

public class DataCountMain1 {

    /*
    기대한 대로 작동하지 않음.
    객체를 생성할 때 마다 Data1 인스턴스가 새로 만들어짐.
    그리고 인스턴스에 포함된 count 변수도 새로 만들어지기 떄문
     */
    public static void main(String[] args) {
        Data1 data1 = new Data1("a");
        System.out.println("data1.count = " + data1.count);

        Data1 data2 = new Data1("b");
        System.out.println("data2.count = " + data2.count);

        Data1 data3 = new Data1("C");
        System.out.println("data3.count = " + data3.count);
    }
}
