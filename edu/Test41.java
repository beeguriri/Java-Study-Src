package edu;		//package : edu라는 폴더 밑에 있음

import java.util.Scanner;

public class Test41 {	//public : 무조건 접근가능 (접근제한자)
						//class : 클래스 이름, 
//		    					자바소스파일과 클래스 이름 반드시 같아야함
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("화면 입력 값: " + n);
		
//		for(int i=0; i<args.length; i++) {
//			
//			System.out.println(args[i]);
//		}
	}

}
