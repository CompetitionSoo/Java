package test;

import java.util.Scanner;

public class test7 {
	public static void main(String[] args) {
		boolean run = true; //반복문의 조건
		int balance = 0; // 은행잔고
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------------");
			System.out.println("1. 예금 |  2. 출금 | 3.  잔고 | 4. 종료");
			System.out.println("----------------------------------");
			
			System.out.print("선택>");
			int selection = Integer.parseInt (scanner.nextLine());
			
			if(selection ==1) {
				System.out.print("예금액>");
				int money = Integer.parseInt(scanner.nextLine());
				balance += money;
			}else if(selection ==2) {
				System.out.print("출금액>");
				int money = Integer.parseInt(scanner.nextLine());
				if(money > balance) {
					System.out.println("잔액이부족합니다.");
				}else {
					balance -= money;
				}
			}else if(selection == 3) {
				System.out.println("잔고>" + balance);
			}else {
				System.out.println("프로그램 종료");
				break;				
		}
		}
	}
}
