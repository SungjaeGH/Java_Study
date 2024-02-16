package ConditionalStatements;

import java.util.Scanner;

/*
[문제: 홀수 짝수 찾기]
정수 x 가 주어지면 x 가 짝수이면 "짝수"를, x 가 홀수이면 "홀수"를 출력하는 프로그램을 작성하자
삼항 연산자를 사용해야 한다.
참고로 x % 2 를 사용하면 홀수, 짝수를 쉽게 계산할 수 있다.
 */
public class EvenOddEx7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("input x : ");
        int x = sc.nextInt();

        System.out.println("x = " + x + ", " + ((x % 2 == 0) ? "짝수" : "홀수"));
    }
}
