package com.ruby.java.ch11;

public class Test02 {

	public static void main(String[] args) {
		
		try {
			System.out.println("1");
			String s = null;
			s.length();						//오류발생
			System.out.println("2");
			System.out.println("3");
			
		} catch(Exception e) {				//catch 실행
			e.printStackTrace();					
			System.out.println("오류발생");
			return;							//return으로 main메서드 종료 -> 이후 코드 실행되지않으나
			
		} finally {							//finally는 무조건 실행
			System.out.println("OK");
		}
		
		System.out.println("4");
		
	}
}
