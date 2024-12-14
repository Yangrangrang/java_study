package lang.object;

// 명시적으로 상속을 받으면 Object를 상속 받지 않는다.
// 구조가 Object -> Parent -> Child 가 됨. (어쩃든 한번은 Object 상속)
public class Child extends Parent{

    public void childMethod() {
        System.out.println("Child.childMethod");
    }
}
