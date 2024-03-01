package array;

import java.util.Scanner;

/*
[문제 - 배열과 역순 출력]
사용자에게 5개의 정수를 입력받아서 배열에 저장하고, 입력받은 순서의 반대인 역순으로 출력하자.
출력시 출력 포멧은 5, 4, 3, 2, 1과 같이 , 쉼표를 사용해서 구분하고, 마지막에는 쉼표를 넣지 않아야 한다.
실행 결과 예시를 참고하자.

 - 실행 결과 예시
    5개의 정수를 입력하세요:
    1
    2
    3
    4
    5
    입력한 정수를 역순으로 출력:
    5, 4, 3, 2, 1
 */
public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputCount = 5;
        int[] inputArr = new int[inputCount];

        for (int idx = inputCount - 1; idx >= 0; idx--) {
            inputArr[idx] = sc.nextInt();
        }

        for (int idx = 0; idx < inputArr.length; idx++) {
            System.out.print(inputArr[idx]);

            if (idx != (inputArr.length - 1)) {
                System.out.print(", ");
            }
        }
    }
}
