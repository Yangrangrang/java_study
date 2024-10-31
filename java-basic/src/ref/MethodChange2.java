package ref;

public class MethodChange2 {

    public static void main(String[] args) {

        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전 dataA.value = " + dataA.value);
        System.out.println("dataA = " + dataA);
        changeReference(dataA);
        System.out.println("메서드 호출 전 dataA.value = " + dataA.value);    // 기본형과 달리 참조형은 참조값을 가지고 있는거라 참조값을 가지고 접근해서 값을 변경하면 변경됨.
        // dataA 와 dataX 이 가지고 있는 참조값은 같다. (같은 인스턴스)
    }

    static void changeReference(Data dataX) {
        System.out.println("dataX = " + dataX);
        dataX.value = 20;
    }
}
