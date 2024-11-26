package final1;

public class FieldInit {

    static final int CONST_VALUE = 10;  //  관래가 static final 이 붙으면 대문자로
    final int value = 10;   // 변수에 이미 값을 할당했기때문에 생성자를 통해서 할당 할 수 없다 (컴파일 오류)
}
