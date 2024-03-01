package array;

/*
[문제와 풀이3]
상품 관리 프로그램 만들기
자바를 이용하여 상품 관리 프로그램을 만들어 보자. 이 프로그램은 다음의 기능이 필요하다:
    상품 등록: 상품 이름과 가격을 입력받아 저장한다.
    상품 목록: 지금까지 등록한 모든 상품의 목록을 출력한다.
다음과 같이 동작해야 한다:
    첫 화면에서 사용자에게 세 가지 선택을 제시한다: "1. 상품 등록", "2. 상품 목록", "3. 종료"
    "1. 상품 등록"을 선택하면, 사용자로부터 상품 이름과 가격을 입력받아 배열에 저장한다.
    "2. 상품 목록"을 선택하면, 배열에 저장된 모든 상품을 출력한다.
    "3. 종료"를 선택하면 프로그램을 종료한다.
제약 조건
    상품은 최대 10개까지 등록할 수 있다.
다음은 사용해야 하는 변수 및 구조이다:
    Scanner scanner : 사용자 입력을 받기 위한 Scanner 객체
    String[] productNames : 상품 이름을 저장할 String 배열
    int[] productPrices : 상품 가격을 저장할 int 배열
    int productCount : 현재 등록된 상품의 개수를 저장할 int 변수
 */

import java.util.Scanner;

public class ProductAdminEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isExit = false;
        String[] productNames = new String[10];
        int[] productPrices = new int[10];
        int productCount = 0;

        while (!isExit) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요:");
            int menuNum = sc.nextInt();

            if (menuNum == 1) {         // 상품 등록
                if (productCount >= 10) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    continue;
                }

                System.out.print("상품 이름을 입력하세요:");
                productNames[productCount] = sc.next();

                System.out.print("상품 가격을 입력하세요:");
                productPrices[productCount] = sc.nextInt();

                productCount++;

            } else if (menuNum == 2) {  // 상품 목록
                if (productCount == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }

                for (int idx = 0; idx < productCount; idx++) {
                    System.out.println(productNames[idx] + ": " + productPrices[idx] + "원");
                }

            } else if (menuNum == 3) {  // 종료
                isExit = true;

            } else {
                System.out.println("잘못된 메뉴를 입력하였습니다. 다시 입력해주세요!");
            }
        }

        System.out.println("프로그램을 종료합니다.");
    }
}
