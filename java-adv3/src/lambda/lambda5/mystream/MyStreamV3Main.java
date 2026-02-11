package lambda.lambda5.mystream;

import java.util.List;

public class MyStreamV3Main {

    public static void main(String[] args) {

        List<Student> students = List.of(
                new Student("Apple", 100),
                new Student("Banana", 80),
                new Student("Berry", 50),
                new Student("Tomato", 40)
        );

        // 점수가 80점 이상인 학생의 이름 추출
        List<String> result1 = ex1(students);
        System.out.println("result1 = " + result1);
    }

    private static List<String> ex1(List<Student> students) {
        return MyStreamV3.of(students)
                .filter(s -> s.getScore() >= 80)
                .map(s -> s.getName())
                .toList();
    }

}
