package loop;

/*
[문제: 구구단 출력]
중첩 for문을 사용해서 구구단을 완성해라.
 */
public class NestedEx1 {
    public static void main(String[] args) {
        for (int level = 1; level <= 9; level++) {
            System.out.println("[level " + level + "]");

            for (int value = 1; value <= 9; value++) {
                System.out.println(level + " * " + value + " = " + level * value);
            }

            System.out.println();
        }
    }
}
