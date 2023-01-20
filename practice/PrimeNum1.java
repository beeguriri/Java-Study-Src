package practice;

import java.util.Scanner;

//교수님코드
//외부에서 args 입력하면 소수인지 판단해보기

public class PrimeNum1 {	
	
	public static boolean prime(int num) {
		
		for (int i = 2; i < num; i++) {
			if(num % i == 0) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {	
		
//		for (int i =0; i < args.length; i++)
//			System.out.println("arg" + i + ":" + args[i]);
		
		int num = Integer.parseInt(args[0]);		//string형태의 데이터 넣으면 자동으로 숫자로 바꿔줌
		if (prime(num) == true) System.out.println("Prime");
		else 					System.out.println("Not Prime");
		
		System.out.println("done");
	}
}
