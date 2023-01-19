package com.ruby.java.ch09;

public class Test07 {

	public static void main(String[] args) {
		
		String s = "한국,일본,중국,미국,독일,프랑스";
		
		String[] list = s.split(",");
		String[] list2 = s.split("," , 2);
		
		for(String item : list) {
			System.out.println(item);
		}
		
		/* 동일한 의미 
		for(int i=0; i<list.length; i++) {
			System.out.println(list[i]);
		} */

		String r = "=".repeat(10);			//tip : 같은문자 반복해서 찍을때
		System.out.println(r);				
		
		for(String item : list2) {
			System.out.println(item);
		}
		
		System.out.println("============");

		String email = "purum@rubypaper.co.kr";		
		int i = email.indexOf("@");					//"@"가 들어있는 시작인덱스 : 5
		String id = email.substring(0, i);			//인덱스 0번부터 글자 i개 잘라냄 : 5개 잘라냄
		String company = email.substring(i + 1);	//인덱스 시작부터 끝까지 잘라냄 
		System.out.println(id);
		System.out.println(company);
	}
}

//valueOf() : 여러 타입의 데이터를 String으로 변환
//String.valueOf : 클래스이름.xx : 스태틱메서드

//프로세스 : 실행
//스레드 : 멀티태스킹
//똑같은 변수를 두고 두개이상 스레드가 동시에 접근
//StringBuffer : 먼저 온 데이터 처리 후 다음 데이터 처리 (멀티스레드 타입에서 안전함)
//StringBuilder : 동시접근처리 안함 (처리속도가 빠름, 동시접근시 오류 날 수도 있음)