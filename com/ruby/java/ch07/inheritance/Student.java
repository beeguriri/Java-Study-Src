package com.ruby.java.ch07.inheritance;

public class Student extends Person{
	private String major;

	public Student() { 		//Student의 생성자
		System.out.println("Student 생성자 실행!");
	}
	
	public Student(String name, int age, String major) {  //Student의 생성자의 오버로딩
		super(name, age);	//상위클래스의 생성자 호출
		this.major = major;
		System.out.println("Student(name, age, major) 생성자 실행!");
	}
	

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	public String toString() {
		return super.toString() + "   major : " + major;
	}
}