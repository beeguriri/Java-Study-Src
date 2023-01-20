package com.ruby.java.ch11;

public class Test01 {

	
	public static void test() {					//예외처리 메서드를 만들어서 사용하는 테스트
		
		try {
			String s = new String("java");
			int len = s.length();
			s = null;
			s.length();
			
			int arr [] = new int [3];
			arr[3] = 30;
			System.out.println("OK");	

		} catch(NullPointerException e2) {						//위에서부터 예외처리 시작, 해당되는 코드 있으면 종료
			e2.printStackTrace();								//printStackTrace(): 에러 발생한 코드 출력
			System.out.println("잘못된 참조!" + e2.getMessage());	//getMessage(): 에러 발생한 객체의 메시지 추출	
		} catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println("잘못된 배열의 인덱스 사용!");
		} catch(Exception e) {							//모든 종류의 예외를 처리하겠다!
			System.out.println("모든종류 예외처리");			//Exception : 모든 예외클래스의 상위클래스
		}
		
		System.out.println("GOOD!");
		
	}
	
	public static void main(String[] args) {

		test();
		
		/*
		int arr [] = new int [3];		//데이터 3개 생성 -> index : arr[0] arr[1] arr[2]
		arr[3] = 30;					//IndexOutOfBoundsException
		System.out.println("OK");	
		*/
	}
}
