package loop;

import java.util.Scanner;

/*
[문제: 피라미드 출력]
int rows 를 선언해라.
이 수만큼 다음과 같은 피라미드를 출력하면 된다.

참고: println() 은 출력후 다음 라인으로 넘어간다. 라인을 넘기지 않고 출력하려면 print() 를 사용하면 된다.
예) System.out.print("*")
 */
public class NestedEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("input rows : ");
        int rows = sc.nextInt();

        for (int row = 1; row <= rows; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
