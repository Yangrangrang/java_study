package nested.anonymous.ex;

import java.util.Random;

// 익명 클래스
public class Ex1RefMainV3 {

    private static void hello(Process process) {
        System.out.println("프로그램 시작");
        // 코드 조간 시작
        process.run();
        // 코드 조각 종료
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {

        // 익명 클래스 (한번만 사용하고 있으니까)
        Process dice = new Process() {
            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + randomValue);
            }
        };

        Process sum = new Process() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        };

        hello(dice);
        hello(sum);
    }


}
