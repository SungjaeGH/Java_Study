package array;

import java.util.Arrays;
import java.util.Scanner;

/*
[문제 - 가장 작은 수, 큰 수 찾기]
사용자로부터 n개의 정수를 입력받아 배열에 저장한 후, 배열 내에서 가장 작은 수와 가장 큰 수를 찾아 출력하는 프로
그램을 작성하자. 실행 결과 예시를 참고하자.
 - 실행 결과 예시
    입력받을 숫자의 개수를 입력하세요:3
    3개의 정수를 입력하세요:
    1
    2
    5
    가장 작은 정수: 1
    가장 큰 정수: 5
 */
public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int inputCount = sc.nextInt();

        int[] inputArr = new int[inputCount];
        System.out.println("3개의 정수를 입력하세요:");
        for (int idx = 0; idx < inputCount; idx++) {
            inputArr[idx] = sc.nextInt();
        }

        System.out.println("가장 작은 정수: " + Arrays.stream(inputArr).min().getAsInt());
        System.out.println("가장 큰 정수: " + Arrays.stream(inputArr).max().getAsInt());
    }
}
