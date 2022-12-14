package Day31;

import java.util.*;

public class ProductServiceImpVer01ByTeacher implements ProductServiceVer01ByTeacher{
	
	@Override
	public ProductVer01ByTeacher inputProduct() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" 분류 : ");
		
		String type = sc.nextLine();
		
		System.out.print(" 제품명 : ");
		
		String title = sc.nextLine();
		
		System.out.print(" 구매가 : ");
		
		int buyPrice = sc.nextInt();
		
		System.out.print(" 판매가 : ");
		
		int sellPrice = sc.nextInt();
		
		if(buyPrice  > sellPrice) {
			
			return null;
			
		}
		
		return new ProductVer01ByTeacher(type, title, buyPrice, sellPrice);
		
	}
	
	@Override
	public boolean insertProduct(List<ProductVer01ByTeacher> productList, ProductVer01ByTeacher product) {
		
		// 매개변수 예외 체크 (productList & product에 등록된게 아무것도 없는지 체크)
		
		if(product == null || productList == null) {
			
			return false;
			
		}
		
		// 이미 등록된 제품인지 체크
		
		if(productList.contains(product)) {
			
			return false;
			
		}
		
		// 제품 등록
		
		productList.add(product);
		
		return true;
		
	}

	@Override
	public boolean updateProduct(List<ProductVer01ByTeacher> productList, ProductVer01ByTeacher product, int index) {
		
		// 매개변수 예외 체크 (productList & product에 등록된게 아무것도 없는지 체크)
		
		if(productList == null || productList.size() == 0 || index < 0 || product == null) {
			
			return false;
			
		}
		
		// 수정
		
		productList.set(index, product);
		
		return true;
		
	}

	@Override
	public boolean deleteProduct(List<ProductVer01ByTeacher> productList, ProductVer01ByTeacher product) {
		
		// 매개변수 예외 체크
		
		if(productList == null || productList.size() == 0 || product == null) {
			
			return false;
			
		}
		
		return productList.remove(product);
		
	}
	
	@Override
	public ProductVer01ByTeacher getProduct(List<ProductVer01ByTeacher> productList, int index) {
		
		// 매개변수 예외 체크 (productList & product에 등록된게 아무것도 없는지 체크)
		
		if(productList == null || productList.size() <= index || index < 0) {
			
			return null;
			
		}
		
		return productList.get(index);
		
	}
	
	@Override
	public ProductVer01ByTeacher getProduct(List<ProductVer01ByTeacher> productList, ProductVer01ByTeacher product) {
		
		int index = productList.indexOf(product);
		
		if(index < 0) {
			
			return null;
			
		}
		
		return productList.get(index);
		
	}
	
	@Override
	public boolean productStock(ProductVer01ByTeacher product, int amount) {
		
		// 판매시 판매 수량은 재고량보다 클 수 없다.
		
		if(amount < 0 && product.getAmount() < -amount) {
					
			System.out.println("--------------------------");
					
			System.out.println(" 재고량이 부족합니다. ");
					
			System.out.println("--------------------------");
					
			return false;
					
		}
				
		product.addAmount(amount);
		
		return true;
		
	}

}