package com.ruby.java.test1;

public class Test01 {

	
	static void test(int...v) {				//"...v" : 가변길이 인자
	 											
		System.out.print("가변인자 길이 : " + v.length + " // ");
		
		for(int x : v)						// 매개변수 x
			System.out.print(x + " ");
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		test(1);							//메소드 호출 및 인자
		test(1, 2);
		test(1, 2, 3);
		test(1, 3, 5, 7, 9, 11, 13);
	
	}

}
