package Day29;

import java.util.Scanner;

public class Problem01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str1 = "abc";
		
		String str2 = "abc";
		
		String str3 = sc.next();
		
		System.out.println(str1.equals(str3));
		
		System.out.println(str1.equals(str2));
		
		sc.close();
		
	}

}