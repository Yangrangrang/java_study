package lang.immutable.change;

public class ImmutableMain2 {

    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        obj1.add(20);   // 리턴값을 써야하는데 안써서 아무것도 처리되지 않은 거 처럼 보임. (꼭 반환값을 받아야함)

        // 계산 이후에도 기존값과 신규값 모두 확인 가능
        System.out.println("obj1 = " + obj1.getValue());
    }
}
