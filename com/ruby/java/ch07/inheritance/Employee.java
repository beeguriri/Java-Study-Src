package com.ruby.java.ch07.inheritance;

public class Employee extends Person {
	
	private String dept;

	public Employee() { //Employee의 생성자
		super();
		System.out.println("Employee 생성자 실행!");
	}
	
	public Employee(String name, int age, String dept) { //Employee의 생성자 오버로딩
		super(name, age);	//상위클래스의 생성자 호출
		this.dept = dept;
		System.out.println("Employee(name, age, dept) 생성자 실행!");
	}
	
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String toString() {
//		return name + " : " + age + " : " + dept;  //오류발생
//		return getName() + " : " + getAge() + " : " + dept;
//		return this.getName() + " : " + this.getAge() + " : " + dept; (같은 결과)
		return super.toString() + " : " + dept;		// super클래스의 메서드 "호출"은 가능
	}
	

}