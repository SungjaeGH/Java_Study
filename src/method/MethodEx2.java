package method;

/*
[문제 - 반복 출력 리펙토링]
다음은 특정 숫자만큼 같은 메시지를 반복 출력하는 기능이다.
메서드를 사용해서 리펙토링해보자.

package method.ex;
public class MethodEx2 {
 public static void main(String[] args) {
     String message = "Hello, world!";
     for (int i = 0; i < 3; i++) {
        System.out.println(message);
     }
     for (int i = 0; i < 5; i++) {
        System.out.println(message);
     }
     for (int i = 0; i < 7; i++) {
        System.out.println(message);
     }
 }
}
 */

public class MethodEx2 {
    // Message 출력
    private static void printMsg(int printCount, String message) {
        for (int idx = 0; idx < printCount; idx++) {
            System.out.println(message);
        }

        System.out.println();
    }

    public static void main(String[] args) {
        String message = "Hello, world!";
        printMsg(3, message);
        printMsg(5, message);
        printMsg(7, message);
    }
}