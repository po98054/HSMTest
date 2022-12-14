package Day31;

import java.util.*;

public class ShoppingProgramVer01ByTeacher {
	
	private List<ProductVer01ByTeacher> productList = new ArrayList<ProductVer01ByTeacher>();
	
	private List<SalesVer01ByTeacher> salesList = new ArrayList<SalesVer01ByTeacher>();
	
	private ProductControllerVer01ByTeacher productController = new ProductControllerVer01ByTeacher(productList);
	
	private SalesControllerVer01ByTeacher salesController = new SalesControllerVer01ByTeacher(salesList, productList);
	
	private Scanner sc = new Scanner(System.in);

	public void run() {
		
		int menu = -1;
		
		final int exit = 7;
		
		do {
			
			try {
			
			printMenu();
			
			menu = inputInt();
			
			exeMenu(menu);
			
			}catch(Exception e) {
				
				System.out.println(e.getMessage());
				
			}
			
		} while(menu != exit);
		
	}

	private void printMenu() {
		
		System.out.println("----------------메인 메뉴--------------");
		
		System.out.println(" 1. 제품 추가 ");
		
		System.out.println(" 2. 제품 수정 ");
		
		System.out.println(" 3. 제품 삭제 ");
		
		System.out.println(" 4. 제품 구매 ");
		
		System.out.println(" 5. 제품 판매 ");
		
		System.out.println(" 6. 매출액 확인 ");
		
		System.out.println(" 7. 프로그램 종료 ");
		
		System.out.println("-------------------------------------");
		
		System.out.print("메인 메뉴를 선택하세요 : ");
		
	}
	
	private int inputInt() {
		
		int num = sc.nextInt();
		
		sc.nextLine();
		
		return num;
		
	}
	
	private void exeMenu(int menu) {
		
		switch(menu) {
		
		case 1 :
			
			System.out.println("--------------------------------");
			
			productController.insertProduct();
			
			System.out.println("--------------------------------");
			
			break;
			
		case 2 :
			
			System.out.println("--------------------------------");
			
			productController.updateProduct();
			
			System.out.println(productList);
			
			System.out.println("--------------------------------");
			
			break;
			
		case 3 :
	
			System.out.println("--------------------------------");
			
			productController.deleteProduct();
	
			System.out.println("--------------------------------");
	
			break;
	
		case 4 :
	
			System.out.println("--------------------------------");
	
			salesController.sales("구매");
	
			System.out.println("--------------------------------");
	
			break;
	
		case 5 :
	
			System.out.println("--------------------------------");
	
			salesController.sales("판매");
	
			System.out.println("--------------------------------");
	
			break;
	
		case 6 :
	
			System.out.println("--------------------------------");
	
			salesController.print();
	
			System.out.println("--------------------------------");
	
			break;
	
		case 7 :
	
			System.out.println("--------------------------------");
	
			System.out.println(" 프로그램을 종료합니다. ");
	
			System.out.println("--------------------------------");
	
			break;
	
	default :
	
			System.out.println("--------------------------------");
	
			System.out.println(" 메인 메뉴를 잘못 입력했습니다. ");
	
			System.out.println("--------------------------------");
	
			break;
		
		}
		
	}

}