package array;

import java.util.Arrays;
import java.util.Scanner;

/*
[문제 - 2차원 배열1]
사용자로부터 4명 학생의 국어, 수학, 영어 점수를 입력받아 각 학생의 총점과 평균을 계산하는 프로그램을 작성하자.
2차원 배열을 사용하고, 실행 결과 예시를 참고하자.
 - 실행 결과 예시
    1번 학생의 성적을 입력하세요:
    국어 점수:100
    영어 점수:80
    수학 점수:70
    2번 학생의 성적을 입력하세요:
    국어 점수:30
    영어 점수:40
    수학 점수:50
    3번 학생의 성적을 입력하세요:
    국어 점수:60
    영어 점수:70
    수학 점수:50
    4번 학생의 성적을 입력하세요:
    국어 점수:90
    영어 점수:100
    수학 점수:80
    1번 학생의 총점: 250, 평균: 83.33333333333333
    2번 학생의 총점: 120, 평균: 40.0
    3번 학생의 총점: 180, 평균: 60.0
    4번 학생의 총점: 270, 평균: 90.0
 */
public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stuCount = 4;
        int[][] scoreArr = new int[stuCount][3];

        for (int idx = 1; idx <= stuCount; idx++) {
            System.out.println(idx + "번 학생의 성적을 입력하세요:");
            System.out.print("국어 점수:");
            scoreArr[idx - 1][0] = sc.nextInt();

            System.out.print("영어 점수:");
            scoreArr[idx - 1][1] = sc.nextInt();

            System.out.print("수학 점수:");
            scoreArr[idx - 1][2] = sc.nextInt();
        }

        for (int stuIdx = 1; stuIdx <= scoreArr.length; stuIdx++) {
            int[] scoreInfo = scoreArr[stuIdx - 1];

            int sum = Arrays.stream(scoreInfo).sum();
            double average = Arrays.stream(scoreInfo).average().orElse(0);

            System.out.println(stuIdx + "번 학생의 총점: " + sum + ", 평균: " + average);
        }
    }
}
