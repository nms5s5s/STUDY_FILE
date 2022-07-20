package Chapter04;

import java.util.Scanner;

public class exercise07 {
    public static void main(String[] args) {
        boolean run = true;

        int balance =0;
        int number = 0;

        Scanner sc = new Scanner(System.in);

        while (run) {
            System.out.println("---------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료 ");
            System.out.println("---------");
            System.out.println("선택>");

            number = sc.nextInt();
            if(number == 1){
                System.out.println("예금액>");
                balance = sc.nextInt();
            }else if (number == 2) {
                System.out.println("출금액>");
                balance = sc.nextInt();
            }else if (number == 3) {
                System.out.println("잔고>8000");
            }else if (number == 4) {
                System.out.println("프로그램을 종료합니다");

            }
        }
    }
}