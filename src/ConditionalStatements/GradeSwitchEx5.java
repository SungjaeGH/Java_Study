package ConditionalStatements;

import java.util.Scanner;

/*
[문제: "학점에 따른 성취도 출력하기"]
String grade 라는 문자열을 만들고, 학점에 따라 성취도를 출력하는 프로그램을 작성하자. 각 학점은 다음과 같은
성취도를 나타낸다.
    "A": "탁월한 성과입니다!"
    "B": "좋은 성과입니다!"
    "C": "준수한 성과입니다!"
    "D": "향상이 필요합니다."
    "F": "불합격입니다."
    나머지: "잘못된 학점입니다."
switch 문을 사용해서 문제를 해결하자.
 */
public class GradeSwitchEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("input grade : ");
        String grade = sc.nextLine();

        String resultMsg = null;

        switch (grade.toUpperCase()) {
            case "A" -> resultMsg = "탁월한 성과입니다!";
            case "B" -> resultMsg = "좋은 성과입니다!";
            case "C" -> resultMsg = "준수한 성과입니다!";
            case "D" -> resultMsg = "향상이 필요합니다.";
            case "F" -> resultMsg = "불합격입니다.";
            default -> resultMsg = "잘못된 학점입니다.";
        }

        System.out.println("출력 : " + resultMsg);
    }

}
