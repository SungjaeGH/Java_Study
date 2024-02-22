package scanner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
[문제 - 입력한 숫자의 합계와 평균]
사용자로부터 여러 개의 숫자를 입력 받고, 그 숫자들의 합계와 평균을 계산하는 프로그램을 작성하세요. 사
용자는 숫자를 입력하고, 마지막에는 -1을 입력하여 숫자 입력을 종료한다고 가정합니다.
모든 숫자의 입력이 끝난 후에는, 숫자들의 합계 sum 과 평균 average 를 출력하세요. 평균은 소수점 아
래까지 계산해야 합니다.
다음 실행 결과 예시를 참고해주세요.
 - 실행 결과 예시
    숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요:
    1
    2
    3
    4
    -1
    입력한 숫자들의 합계: 10
    입력한 숫자들의 평균: 2.5
 */
public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요:");

        boolean isExit = false;
        while (!isExit) {
            int input = sc.nextInt();
            if (input == -1) {
                isExit = true;

            } else {
                list.add(input);
            }
        }

/*
  < 입력 받기 기능 참고>
     int sum = 0, count = 0, input = 0;

     while ((input = scanner.nextInt()) != -1) {
        sum += input;
        count++;
     }
*/


        int[] inputArr = list.stream().mapToInt(num -> num).toArray();
        int sum = Arrays.stream(inputArr).sum();
        double average = Arrays.stream(inputArr)
                .average()
                .orElse(0);

        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + average);
    }
}
