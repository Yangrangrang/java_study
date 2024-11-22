package static1;

public class DataCountMain3 {

    /*
    정적변수에 접근하는 방법이 조금 특이함.
    Data3.count 로 접근해야함.
    static 이 붙은 멤버변수는 메서드 영역에서 관리함. ( 힙영역이 아님)
     */
    public static void main(String[] args) {
        Data3 data1 = new Data3("a");
        System.out.println("a.count = " + Data3.count); //  data1.count 가 아닌 Data3.count

        Data3 data2 = new Data3("b");
        System.out.println("b.count = " + Data3.count);

        Data3 data3 = new Data3("c");
        System.out.println("c.count = " + Data3.count);

        // 추가
        // 인스턴스를 통한 접근
        Data3 data4 = new Data3("D");
        System.out.println("data4.count = " + data4.count); // 실제로는 인스턴스에 있는 데이터를 쓰는게 아니다.(권장하지 않음)

        // 클래스를 통한 접근
        System.out.println("Data3.count = " + Data3.count);

    }
}
