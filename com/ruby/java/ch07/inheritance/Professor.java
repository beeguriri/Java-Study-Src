package com.ruby.java.ch07.inheritance;

public class Professor extends Person{

	private String subject;

	public Professor() { 		//Professor의 생성자
		System.out.println("Professor 생성자 실행!");
	}
	
	public Professor(String name, int age, String subject) { //Professor의 생성자의 오버로딩
		super(name, age);	//상위클래스의 생성자 호출
		this.subject = subject;
		System.out.println("Professor(name, age, subject) 생성자 실행!");
	}	
	
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
}