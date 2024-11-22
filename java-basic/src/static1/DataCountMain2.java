package static1;

public class DataCountMain2 {

    /*
    원하는 대로 값은 나온다.
    하지만 불편한 점은 Data2가 몇개 생성 된지 구하는건데, Data2와 무관하게 Counter 클래스를 만들어야 한다.
    생성자에 매개변수가 추가됨. 생성자가 복잡해짐.

    외부의 도움을 받지 않고, Data2에서 처리 할 수 있는 방법이 없을까 고민하게 됨.(뭔가 공용 변수)
     */
    public static void main(String[] args) {
        Counter counter = new Counter();
        Data2 data1 = new Data2("A", counter);
        System.out.println("A.count = " + counter.count);

        Data2 data2 = new Data2("B", counter);
        System.out.println("B.count = " + counter.count);

        Data2 data3 = new Data2("C", counter);
        System.out.println("C.count = " + counter.count);
    }
}
