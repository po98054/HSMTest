package Day06;

import java.util.Scanner;

public class ArrayCopy03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[5];
		int[] array2 = new int[array.length];
		int[] array3 = new int[array.length];
		
		int sum = 0;
		int sum2 = 0;
		int sum3 = 0;

		double sum4[] = new double[array.length];
		double avg4[] = new double[array.length];
		
		for(int i = 0; i < array.length; i++) {
			
			System.out.println("----------------------------------");
			
			System.out.print("당신의 국어, 수학, 영어 성적을 입력하세요 : ");
			
			int num = sc.nextInt();
			int num2 = sc.nextInt();
			int num3 = sc.nextInt();
			
			array[i] = num;
			array2[i] = num2;
			array3[i] = num3;
			
			sum = sum + array[i];
			sum2 = sum2 + array2[i];
			sum3 = sum3 + array3[i];
			
			sum4[i] = array[i] + array2[i] + array3[i];
			avg4[i] = sum4[i] / 3;
			
			System.out.println(i + "번 학생의 국어 성적 = " + array[i]);
			System.out.println(i + "번 학생의 수학 성적 = " + array2[i]);
			System.out.println(i + "번 학생의 영어 성적 = " + array3[i]);
			System.out.println(i + "번 학생의 총 합계 = " + sum4[i]);
			System.out.println(i + "번 학생의 평균 = " + avg4[i]);
			
		}
		
		System.out.println("----------------------------------");
		
		System.out.println("5명 학생의 총 국어 점수 = " + sum);
		System.out.println("5명 학생의 총 수학 점수 = " + sum2);
		System.out.println("5명 학생의 총 영어 점수 = " + sum3);
		
		System.out.println("----------------------------------");
		
		System.out.println(array[0] + " " + array[1] + " " + array[2] + " " + array[3] + " " + array[4]);
		System.out.println(array2[0] + " " + array2[1] + " " + array2[2] + " " + array2[3] + " " + array2[4]);
		System.out.println(array3[0] + " " + array3[1] + " " + array3[2] + " " + array3[3] + " " + array3[4]);
		System.out.println(sum4[0] + " " + sum4[1] + " " + sum4[2] + " " + sum4[3] + " " + sum4[4]);
		System.out.println(avg4[0] + " " + avg4[1] + " " + avg4[2] + " " + avg4[3] + " " + avg4[4]);
		
		double Avg = (double) sum / (double) 5;
		double Avg2 = (double) sum2 / (double) 5;
		double Avg3 = (double) sum3 / (double) 5;
		
		System.out.println("----------------------------------");
		
		System.out.println("총 5명 학생의 국어 평균 성적 : " + Avg);
		System.out.println("총 5명 학생의 수학 평균 성적 : " + Avg2);
		System.out.println("총 5명 학생의 영어 평균 성적 : " + Avg3);
		
		sc.close();
		
		

	}

}
