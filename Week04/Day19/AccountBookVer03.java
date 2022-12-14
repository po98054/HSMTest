package Day19;

import java.text.ParseException;

import java.util.ArrayList;

import java.util.InputMismatchException;

import java.util.Scanner;

public class AccountBookVer03 {
	
	ArrayList<ItemVer03> list = new ArrayList<ItemVer03>();
	
	AccountServiceVer03 accountService = new AccountServiceImpVer03();
	
	Scanner sc;
	
	public void run() {
		
		System.out.println("가계부 프로그램 실행합니다.");
		
		int menu = -1;
		
		do {
			
			try {
				
				accountService.printMenu();
				
				menu = sc.nextInt();
				
				accountService.runMenu(list, menu, sc);
				
			} catch(ParseException e) {
				
				System.out.println("-------------------------");
				
				System.out.println("날짜 형태가 잘못되었습니다.");
				
			} catch(InputMismatchException e) {
				
				System.out.println("-------------------------");
				
				System.out.println("잘못된 타입을 입력했습니다.");
				
				sc.nextLine();
				
			} catch(RuntimeException e) {
				
				System.out.println("-------------------------");
				
				System.out.println(e.getMessage());
				
			}
			
		} while (menu != 5);
		
		System.out.println("-------------------------");
		
		System.out.println("가계부 프로그램 종료합니다.");
		
	}
	
	public AccountBookVer03(Scanner sc) {
		
	if(sc == null) {
		
		this.sc = new Scanner(System.in);
		
	} else {
		
		this.sc = sc;
		
	}
		
}
	
}