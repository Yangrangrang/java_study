package nested.anonymous.ex;

import java.util.Random;

// 내 생각으로 했던....예제.........ㅎ...
public class Ex1RefMain {

    private static void helloDice(String str) {
        System.out.println("프로그램 시작");
        // 코드 조간 시작

        if (str.equals("helloDice")) {
            new Hello().helloDice();
        } else if (str.equals("helloSum")) {
            new Hello().helloSum();
        }

        // 코드 조각 종료
        System.out.println("프로그램 종료");
    }

    static class Hello {
        private void helloDice() {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 = " + randomValue);
        }

        private void helloSum() {
            for (int i = 0; i <3; i++) {
                System.out.println("i = " + i);
            }
        }
    }

    public static void main(String[] args) {
        helloDice("helloDice");
    }


}
