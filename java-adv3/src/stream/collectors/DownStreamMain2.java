package stream.collectors;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class DownStreamMain2 {

    public static void main(String[] args) {

        List<Student> students = List.of(
                new Student("kim", 1, 85),
                new Student("lee", 1, 70),
                new Student("park", 2, 70),
                new Student("yang", 2, 90),
                new Student("jung", 3, 90),
                new Student("ha", 3, 89)
        );

        // 1단계: 학년별로 학생들을 그룹화 하라.
        Map<Integer, List<Student>> collect1 = students.stream()
                .collect(Collectors.groupingBy(Student::getGrade));
        System.out.println("collect1 = " + collect1);

        // 2단계: 학년별로 가장 점수가 높은 학생을 구하라. reducing 사용
        Map<Integer, Optional<Student>> collect2 = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getGrade,
                        Collectors.reducing((s1, s2) -> s1.getScore() > s2.getScore() ? s1 : s2)
                ));
        System.out.println("collect2 = " + collect2);

        // 3단계: 학년별로 가장 점수가 높은 학생을 구하라 maxBy 사용
        Map<Integer, Optional<Student>> collect3 = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getGrade,
//                        Collectors.maxBy((s1, s2) -> s1.getScore() > s2.getScore() ? 1 : -1)
//                        Collectors.maxBy(Comparator.comparingInt(s -> s.getScore()))
                        Collectors.maxBy(Comparator.comparingInt(Student::getScore))
                ));
        System.out.println("collect3 = " + collect3);
    }
}
