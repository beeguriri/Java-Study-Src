package practice;

import java.util.Scanner;

public class minmax {

	public static void main(String[] args) {

		//두개의 정수 입력 받아서 min,max 정의
		
		Scanner scanner = new Scanner(System.in);	//입력
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		int min = 0;
		int max = 0;
		
		if(num1<num2) {
			min = num1;
			max = num2;
		} else {
			min = num2;
			max = num1;
		}
		
//		System.out.println("min : " + min);
//		System.out.println("max : " + max);
		
		
		//최대공약수 & 최소공배수 출력 (while) (입력12, 18 : 출력 최대공약수 6, 최소공배수 36)
		//루프돌리기 (rem=0될때까지)
		//max%min = rem
		//rem=0 ; 최대공약수 = 작은정수, 최소공배수 = 두정수의 곱 / 최대공약수
		//rem!=0 ; max = min, min = rem, max%min = rem 반복
		
		int res1 = 0; //최대공약수
		int res2 = 0; //최소공배수
		
		int rem = max%min;
		
		while(true) {
			if(rem==0) {
				res1 = min;
				res2 = (min * max) / res1;
//				System.out.println("최대공약수 : " + res1);
//				System.out.println("최소공배수 : " + res2);
				break;
			} else {
				max = min;
				min = rem;
				rem = max%min;
			}
		}
		
		System.out.println("최대공약수 : " + res1);
		System.out.println("최소공배수 : " + res2);
		
	}

}
