package ConditionalStatements;

/*
[문제: 더 큰 숫자 찾기]
여러분은 두 개의 정수 변수 a 와 b 를 가지고 있다. a 의 값은 10 이고, b 의 값은 20 이다. 삼항 연산자를 사용하여
두 숫자 중 더 큰 숫자를 출력하는 코드를 작성하자.
 */
public class CondOpEx6 {
    public static void main(String[] args) {
        int a = 10, b = 20;

        System.out.println("더 큰 숫자는 " + ((a > b) ? a : b) + "입니다.");
    }
}
