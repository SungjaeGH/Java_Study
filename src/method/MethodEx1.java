package method;

/*
[문제 - 평균값 리펙토링]
메서드를 잘 이해하고 있는지 확인하기 위해 다음 코드를 메서드를 사용하도록 리펙토링해보자.
package method.ex;
public class MethodEx1 {
     public static void main(String[] args) {
     int a = 1;
     int b = 2;
     int c = 3;

     int sum = a + b + c;
     double average = sum / 3.0;
     System.out.println("평균값: " + average);

     int x = 15;
     int y = 25;
     int z = 35;

     sum = x + y + z;
     average = sum / 3.0;
     System.out.println("평균값: " + average);
 }
}
 */
public class MethodEx1 {
    // 합
    private static int getSum(int firstNum, int secondNum, int thirdNum) {
        return firstNum + secondNum + thirdNum;
    }

    // 평균
    private static double getAverage(int sum) {
        return sum / 3.0;
    }

    public static void main(String[] args) {
        System.out.println("평균값: " + getAverage(getSum(1, 2, 3)));
        System.out.println("평균값: " + getAverage(getSum(15, 25, 35)));
    }
}
