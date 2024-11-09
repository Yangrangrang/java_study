package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        nameField = nameParameter;
    }
    // 이런 경우 앞에 this 를 생략 할 수 있음.(매개변수 != 멤버변수)
}
