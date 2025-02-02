package generic.ex1;

public class RowTypeMain {

    /**
     * <>을 지정하지 않을 수 있는데, 이런것을 로 타입 (row type) 또는 원시 타입이라 한다.
     * 원시 타입을 사용하면 내부의 타입 매개변수가 Object 로 사용 된다고 이해
     * Object가 필요하면 GenericBox<Object> integerBox = new GenericBox<>(); 작성하는걸 권장
     */
    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox();
//        GenericBox<Object> integerBox = new GenericBox<>(); //권장
        integerBox.set(10);
        Object result = integerBox.get();
        System.out.println("result = " + result);
    }
}
