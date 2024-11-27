package final1;

public class FinalRefMain {

    public static void main(String[] args) {
        final Data data = new Data();   // final 참조형 변수 선언
//        data = new Data();  // 참조값을 변경 할 수 없음 컴파일 오류
        
        // 참조 대상의 값은 변경 가능 
        data.value = 10;
        System.out.println("data.value = " + data.value);
        data.value = 20;
        System.out.println("data.value = " + data.value);
    }
}
