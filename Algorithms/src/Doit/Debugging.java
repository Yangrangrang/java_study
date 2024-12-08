package Doit;

import java.util.Scanner;

public class Debugging {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        int answer = 0;

//        int A[] = new int[100001];
//        int S[] = new int[100001];

        long A[] = new long[100001];    // int 보다 long 이 데이터 범위가 넓음
        long S[] = new long[100001];

//        for (int i = 0; i < 10000; i++) {
        for (int i = 1; i < 100001; i++) {  // 반복문 인덱스 범위 지정 오류, S[i - 1] 에서 배열 0 부터 시작해서 오류
            A[i] = (int) (Math.random() * Integer.MAX_VALUE);
            S[i] = S[i - 1] + A[i];
        }

        for (int t = 0; t < testcase; t++) {
            answer = 0; // answer 값 초기화
            int query = sc.nextInt();
            for (int i = 0; i < query; i++) {
                int start = sc.nextInt();
                int end = sc.nextInt();
                answer += S[end] - S[start - 1];
//                System.out.println(testcase + " " + answer);
                System.out.println(t + " " + answer); // 출력 변수확인
            }
        }
    }
}
