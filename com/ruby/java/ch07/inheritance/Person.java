package com.ruby.java.ch07.inheritance;

public class Person {
	
	private String name;		
	private int age;			

	public Person() {			//Person의 생성자
		System.out.println("Person 생성자 실행!");
	}
	
	public Person(String name, int age) { //sub클래스 공통 파라미터 생성자 선언
		this.name = name;
		this.age = age;
		System.out.println("Person(name, age) 생성자 실행!");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;		// this name : 클래스의 name
								// name : 매개변수 name의 name
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return name + ":" + age;
	}
	

}