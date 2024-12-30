package lang.system;

import java.util.Arrays;

public class SystemMain {

    public static void main(String[] args) {
        // 현재 시간 (밀리초)를 가져온다.
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);
        
        // 현재 시간 (나노초)를 가져온다.
        long currentTimeNano = System.nanoTime();
        System.out.println("currentTimeNano = " + currentTimeNano);
        
        // 환경 변수를 읽는다. (Path 설정, 운영체제 확인)
        System.out.println("System.getenv() = " + System.getenv());
        
        // 시스템 속성을 읽는다. (자바가 사용하는 시스템의 환경, 속성을 읽음)
        System.out.println("System.getProperties() = " + System.getProperties());
        System.out.println("System.getProperty(\"java.version\") = " + System.getProperty("java.version"));

        // 배열을 고속으로 복사한다.
        char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);

        // 배열 출력
        System.out.println("copiedArray = " + copiedArray);
        System.out.println("Arrays.toString = " + Arrays.toString(copiedArray));

        // 프로그램 종료 ( 가급적이면 사용하는걸 권장하지 않는다.)
        System.exit(0);

    }
}
