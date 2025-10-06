package lambda.lambda1;

public class SamMain {

    public static void main(String[] args) {
        SamInterface sam = () -> System.out.println("sam");
        sam.run();

        // 컴파일 오류
//        NotSamInterface notSam = () -> {
//            System.out.println("sam");
//        }
//        notSam.go();
//        notSam.run();
    }
}
