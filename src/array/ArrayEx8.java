package array;

import java.util.Arrays;
import java.util.Scanner;

/*
[문제 - 2차원 배열2]
이전 문제에서 학생수를 입력받도록 개선하자.
실행 결과 예시를 참고하자.
 - 실행 결과 예시
    학생수를 입력하세요:3
    1번 학생의 성적을 입력하세요:
    국어 점수:10
    영어 점수:20
    수학 점수:30
    2번 학생의 성적을 입력하세요:
    국어 점수:10
    영어 점수:10
    수학 점수:10
    3번 학생의 성적을 입력하세요:
    국어 점수:20
    영어 점수:20
    수학 점수:20
    1번 학생의 총점: 60, 평균: 20.0
    2번 학생의 총점: 30, 평균: 10.0
    3번 학생의 총점: 60, 평균: 20.0
 */
public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("학생수를 입력하세요:");
        int stuCount = sc.nextInt();
        int[][] scoreArr = new int[stuCount][3];

        for (int stuIdx = 1; stuIdx <= stuCount; stuIdx++) {
            System.out.println(stuIdx + "번 학생의 성적을 입력하세요:");
            System.out.print("국어 점수:");
            scoreArr[stuIdx - 1][0] = sc.nextInt();

            System.out.print("영어 점수:");
            scoreArr[stuIdx - 1][1] = sc.nextInt();

            System.out.print("수학 점수:");
            scoreArr[stuIdx - 1][2] = sc.nextInt();
        }

        for (int stuIdx = 1; stuIdx <= stuCount; stuIdx++) {
            int[] scoreInfo = scoreArr[stuIdx - 1];

            int sum = Arrays.stream(scoreInfo).sum();
            double average = Arrays.stream(scoreInfo).average().orElse(0);

            System.out.println(stuIdx + "번 학생의 총점: " + sum + ", 평균: " + average);
        }
    }
}
