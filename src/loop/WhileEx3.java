package loop;

import java.util.Scanner;

/*
[문제: 누적 합 계산]
반복문을 사용하여 1부터 max 까지의 합을 계산하고 출력하는 프로그램을 작성해 보세요. 이때, sum 이라는 변수를 사
용하여 누적 합을 표현하고, i 라는 변수를 사용하여 카운트(1부터 max까지 증가하는 변수)를 수행해야 합니다.
while문, for문 2가지 버전의 정답을 만들어야 합니다.
 */
public class WhileEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("input max : ");
        int max = sc.nextInt();

        int sum = 0, count = 1;

        System.out.println("[while loop]");
        while (count <= max) {
            sum += count;
            count++;
        }
        System.out.println("while result : " + sum);

        System.out.println("\n[for loop]");
        for (sum = 0, count = 1; count <= max; count++) {
            sum += count;
        }
        System.out.println("for result : " + sum);
    }
}
