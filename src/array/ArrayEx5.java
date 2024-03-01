package array;

import java.util.Arrays;
import java.util.Scanner;

/*
[문제 - 합계와 평균2]
이전 문제에서 입력받을 숫자의 개수를 입력받도록 개선하자.
실행 결과 예시를 참고하자
 - 실행 결과 예시1
    입력받을 숫자의 개수를 입력하세요:3
    3개의 정수를 입력하세요:
    1
    2
    3
    입력한 정수의 합계: 6
    입력한 정수의 평균: 2.0
 - 실행 결과 예시2
    입력받을 숫자의 개수를 입력하세요:5
    5개의 정수를 입력하세요:
    1
    2
    3
    4
    5
    입력한 정수의 합계: 15
    입력한 정수의 평균: 3.0
 */
public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int inputCount = sc.nextInt();

        int[] inputArr = new int[inputCount];
        System.out.println("3개의 정수를 입력하세요:");
        for (int idx = 0; idx < inputCount; idx++) {
            inputArr[idx] = sc.nextInt();
        }

        System.out.println("입력한 정수의 합계: " + Arrays.stream(inputArr).sum());
        System.out.println("입력한 정수의 평균: " + Arrays.stream(inputArr).average().orElse(0));
    }
}
