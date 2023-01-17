package com.ruby.java.ch06;

public class Member {
	private String name;
	private int age;
	
	public Member() {								
		System.out.println("Member() 생성자 실행");		//2-2. Member() 생성자 실행
	}
	
	public Member(String name) {					//3-2. Member(String) 생성자 실행			
		System.out.println("Member(String) 생성자 실행 : " + name);
	}
	
	public Member(String name, int age) {			//4-2. Member(String, int) 생성자 실행					
		System.out.println("Member(String, int) 생성자 실행 : " + name + "," + age);
	}
	
	public void setName(String name) {
	}
	
	public static void main(String[] args) {		
		System.out.println("main() 메서드 실행");		//1. main 먼저 실행 
		new Member();								//2-1. Member() 생성자 호출
		new Member("Amy");							//3-1. Member(String) 생성자 호출
		new Member("Amy", 23);						//4-1. Member(String, int) 생성자 호출
	}
}
