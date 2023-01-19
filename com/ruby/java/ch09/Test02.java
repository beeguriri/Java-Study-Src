package com.ruby.java.ch09;

public class Test02 {

	public static void main(String[] args) {

		String s1 = new String("java");
		String s2 = "java";
		
		String s3 = new String("java");
		String s4 = "java";
		
		if(s1 == s3) {									//결과 : 다름 (== : 주소값)
			System.out.println("동일 객체이다.");		
		}else {
			System.out.println("다른 객체이다.");
		}
		
		if(s2 == s4) {									//결과 : 동일 (string pool)
			System.out.println("동일 객체이다.");
		}else {
			System.out.println("다른 객체이다.");
		}
		
		if(s1.equals(s3)) {								//결과 : 동일
			System.out.println("동일 문자열을 가집니다.");
		}else {
			System.out.println("다른 문자열을 가집니다.");
		}
		
		if(s2.equals(s4)) {								//결과 : 동일
			System.out.println("동일 문자열을 가집니다.");
		}else {
			System.out.println("다른 문자열을 가집니다.");
		}
		
		String s5 = "JAVA";
		
		if(s1.equals(s5)) {								//결과 : 다름 (대소문자 구별)
			System.out.println("동일 문자열을 가집니다.");
		}else {
			System.out.println("다른 문자열을 가집니다.");
		}
		
		if(s1.equalsIgnoreCase(s5)) {					//equalsIgnoreCase : 대소문자 구분 없이 비교
			System.out.println("동일 문자열을 가집니다.");		//결과 : 동일
		}else {
			System.out.println("다른 문자열을 가집니다.");
		}
		
	}

}
