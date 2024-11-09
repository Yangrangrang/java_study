package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    //추가
    void initMember(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    /*
        클래스의 멤버변수와 매개변수의 이름이 동일 하기 때문에 this 를 사용함. (this 는 자기 자신을 가르킴)
        this를 해주지 않으면 매개변수가 더 가깝기 때문에 우선순위를 갖는다.
     */
}
