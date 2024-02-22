package scanner;

import java.util.Scanner;

/*
[문제 - 상품 구매]
 사용자로부터 상품 정보(상품명, 가격, 수량)를 입력받고, 이들의 총 가격을 출력하는 프로그램을 작성하세
요. 사용자는 여러 상품을 추가하고 결제할 수 있으며, 프로그램을 언제든지 종료할 수 있습니다.
 사용자에게 다음 세 가지 옵션을 제공해야 합니다: 1: 상품 입력, 2: 결제, 3: 프로그램 종료. 옵션은 정수로
입력받으며, 옵션을 저장하는 변수의 이름은 option 이어야 합니다.
 상품 입력 옵션을 선택하면, 사용자에게 상품명과 가격, 수량을 입력받으세요.
결제 옵션을 선택하면, 총 비용을 출력하고 총 비용을 0 으로 초기화하세요. (사용자가 총 비용을 확인하고,
결제를 완료했다고 가정합니다. 따라서 다음 사용자를 위해 총 비용을 다시 0 으로 초기화 해야합니다.)
 프로그램 종료 옵션을 선택하면, "프로그램을 종료합니다."라는 메시지를 출력하고 프로그램을 종료하세요.
위의 세 가지 옵션 외에 다른 값을 입력하면, "올바른 옵션을 선택해주세요."라는 메시지를 출력하세요.
 */
public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isExit = false;
        int totalPrice = 0;

        while (!isExit) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");

            int option = sc.nextInt();
            if (option == 1) {
                // 상품 입력
                System.out.print("상품명을 입력하세요: ");
                String name = sc.next();

                System.out.print("상품의 가격을 입력하세요: ");
                int price = sc.nextInt();

                System.out.print("구매 수량을 입력하세요: ");
                int quantity = sc.nextInt();

                int sum = price * quantity;

                System.out.println("상품명:" + name
                        + " 가격:" + price
                        + " 수량:" + quantity
                        + " 합계:" + sum);

                totalPrice += sum;

            } else if (option == 2) {
                // 결제
                System.out.println("총 비용: " + totalPrice);
                totalPrice = 0;

            } else if (option == 3) {
                // 프로그램 종료
                System.out.println("프로그램을 종료합니다.");
                isExit = true;

            } else {
                // 그 외
                System.out.println("올바른 옵션을 선택해주세요.");
            }
        }
    }
}
