package pack;

import pack.a.User;

public class PackageMain3 {

    // import 는 하나만 할 수 있다.
    // 다른 패키지에 이름이 같은 클래스를 가져와야 할 때는, 하나만 import 하고 나머지는 전체경로를 적어야 한다. (둘다 전체 경로를 적어도 상관없다)
    public static void main(String[] args) {
        User userA = new User();
        pack.b.User userB = new pack.b.User();
    }
}
