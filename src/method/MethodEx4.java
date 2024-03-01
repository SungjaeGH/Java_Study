package method;

/*
[문제 - 은행 계좌 입출금]
다음 실행 예시를 참고해서, 사용자로부터 계속 입력을 받아 입금과 출금을 반복 수행하는 프로그램을 작성
하자. 또한 간단한 메뉴를 표시하여 어떤 동작을 수행해야 할지 선택할 수 있게 하자
출금시 잔액이 부족하다면 "x원을 출금하려 했으나 잔액이 부족합니다."라고 출력해야 한다.
 */

import java.util.Scanner;

public class MethodEx4 {
    // 1. 입금
    private static long deposit(long balance, long depositAmount) {
        balance += depositAmount;
        System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");

        return balance;
    }

    // 2. 출금
    private static long withdraw(long balance, long withdrawAmount) {
        if (balance - withdrawAmount < 0) {
            System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니다.");
            return balance;
        }

        balance -= withdrawAmount;
        System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");

        return balance;
    }

    // 3. 잔액 조회
    private static void printBalance(long balance) {
        System.out.println("현재 잔액: " + balance + "원");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isExit = false;
        long balance = 0;

        while (!isExit) {
            System.out.println(
                    """
                    ---------------------------------
                    1.입금 | 2.출금 | 3.잔액 확인 | 4.종료
                    ---------------------------------
                    """
            );

            System.out.print("선택: ");
            int menuNum = sc.nextInt();

            switch (menuNum) {
                case 1:
                    System.out.print("입금액을 입력하세요: ");
                    long depositAmount = sc.nextLong();

                    balance = deposit(balance, depositAmount);
                    break;

                case 2:
                    System.out.print("출금액을 입력하세요: ");
                    long withdrawAmount = sc.nextLong();

                    balance = withdraw(balance, withdrawAmount);
                    break;

                case 3:
                    printBalance(balance);
                    break;

                case 4:
                    isExit = true;
                    break;

                default:
                    System.out.println("메뉴를 잘못 입력했습니다. 다시 입력해주세요!");
                    break;
            }
        }

        System.out.println("시스템을 종료합니다.");
    }
}
