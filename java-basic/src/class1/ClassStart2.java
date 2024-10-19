package class1;

public class ClassStart2 {

    public static void main(String[] args) {
        String[] studentNames = {"학생1", "학생2"};
        int[] studentAges = {15, 16};
        int[] studentGrades = {90, 80};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름: " + studentNames[i] + " 나이: " + studentAges[i] + " 성적: " + studentGrades[i]);
        }

        // 데이터가 순서대로 들어가있기 때문에 수정할 때, 매우 조심해서 수정 해야한다.
        // 한 학생의 데이터가 3개의 배열에 나누어져 있기때문에
    }
}
