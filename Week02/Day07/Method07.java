package Day07;

public class Method07 {
	
	public static void main(String[] args) {
		
		int array[] = {1, 3, 5, 6};
		
		int num = 2;
		
		if(trueNum(array,num)) {
			
			System.out.println(num + "는 배열에 있습니다.");
			
		} else {
			
			System.out.println(num + "는 배열에 없습니다.");
			
		}
		
	}
	
	public static boolean trueNum(int array[], int num) {
		
		for(int i = 0; i < array.length; i++) {
			
			if(array[i] == num) {
				
				return true;
				
			
		}
			
			System.out.println(array[i] + "과 " + num + "는 일치하지 않습니다.");
			
		}
		
		return false;
		
	}
	
}