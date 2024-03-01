package array;

import java.util.Arrays;
import java.util.Scanner;

/*
[문제 - 합계와 평균]
사용자에게 5개의 정수를 입력받아서 이들 정수의 합계와 평균을 계산하는 프로그램을 작성하자.
 - 실행 결과 예시
    5개의 정수를 입력하세요:
    1
    2
    3
    4
    5
    입력한 정수의 합계: 15
    입력한 정수의 평균: 3.0
 */
public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputCount = 5;
        int[] inputArr = new int[inputCount];

        for (int idx = 0; idx < inputArr.length; idx++) {
            inputArr[idx] = sc.nextInt();
        }

        System.out.println("입력한 정수의 합계: " + Arrays.stream(inputArr).sum());
        System.out.println("입력한 정수의 평균: " + Arrays.stream(inputArr).average().orElse(0));
    }
}
