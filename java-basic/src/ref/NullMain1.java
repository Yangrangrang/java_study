package ref;

public class NullMain1 {

    public static void main(String[] args) {
        Data data = null;   // data 변수에 아직 가르키는 객체가 없다는 뜻
        System.out.println("1. data = " + data);
        data = new Data();  // 참조값이 들어감
        System.out.println("2. data = " + data);
        data = null;        // 앞서 참조하던 인스턴스를 참조하지 않음.
        System.out.println("3. data = " + data);

        // GC - 가비지 컬렉션 (아무도 참조하지 않은 인스턴스의 최후)
        // data 를 null 로 하면서, new Data 한 인스턴스를 아무도 참조하지 않는다. (접근할 방법이 없다)
        // 메모리 용량만 차지 할 뿐이다.
        // 아무도 참조하지 않는 인스턴스가 있으면 JVM의 GC 가 더 이상 사용하지 않는 인스턴스라 판단하고 해당 인스턴스를 자동으로 메모리에서 제거해줌.
    }
}
