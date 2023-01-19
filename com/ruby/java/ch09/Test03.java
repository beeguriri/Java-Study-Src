package com.ruby.java.ch09;

public class Test03 {

	public static void main(String[] args) {
		
		String s = "have a good day!";
		
		int length = s.length();				  // length() : 글자수(공백 포함)
		System.out.println("총글자수 : " + length); 
		
		char c;
		
		for(int i = 0; i < length; i++) {
			c=s.charAt(i);						//charAt(int index) 
												// : string 타입으로 받은 문자열을 char 타입으로 한 글자만 받는 함수 
			if(c != ' ') {						
				System.out.print(c);	
			} else {
				System.out.println();
			}
			
		}		
	}
}
