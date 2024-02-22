package scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
[문제 - 홀수 짝수]
사용자로부터 하나의 정수를 입력받고, 이 정수가 홀수인지 짝수인지 판별하는 프로그램을 작성하세요.
 - 실행 결과 예시
    하나의 정수를 입력하세요:1
    입력한 숫자 1는 홀수입니다.
 - 실행 결과 예시
    하나의 정수를 입력하세요:4
    입력한 숫자 4는 짝수입니다.
 */
public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int num = 0;
            System.out.print("하나의 정수를 입력하세요:");

            try {
                num = sc.nextInt();
                sc.nextLine();  // 버퍼를 비우는 용도

            } catch (InputMismatchException e) {
                sc.nextLine();  // 버퍼를 비우는 용도
                System.out.println("정수가 입력되지 않아 종료합니다.");
                break;
            }

            String resultMsg = (num % 2 == 0) ? "짝수" : "홀수";
            System.out.println("입력한 숫자 " + num + "는 " + resultMsg + "입니다.\n");
        }
    }
}
