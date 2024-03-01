package array;

import java.util.Arrays;

/*
[문제 - 배열을 사용하도록 변경]
다음 문제를 배열을 사용해서 개선하자
public class ArrayEx1 {
 public static void main(String[] args) {
     int student1 = 90;
     int student2 = 80;
     int student3 = 70;
     int student4 = 60;
     int student5 = 50;
     int total = student1 + student2 + student3 + student4 + student5;
     double average = (double) total / 5;
     System.out.println("점수 총합: " + total);
     System.out.println("점수 평균: " + average);
 }
}
 */
public class ArrayEx1 {
    public static void main(String[] args) {
        int[] studentArr = {90, 80, 70, 60, 50};
        int total = Arrays.stream(studentArr)
                .sum();
        double average = Arrays.stream(studentArr)
                .average()
                .orElse(0);

        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
}
