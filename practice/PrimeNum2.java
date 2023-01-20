package practice;

import java.util.Scanner;

public class PrimeNum2 {

	//교수님이 짠거
	
	public static void prime (int num) {
		System.out.println("입력숫자 : " + num);
	}
	
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Number : ");
			int num;
			while ((num = sc.nextInt()) !=0) {
				
				prime(num);
				System.out.print("Number : ");
			}
		}
		System.out.println("프로그램을 종료합니다");
	}
}
