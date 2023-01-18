package com.ruby.java.ch07.inheritance;
public class Student extends Person {
	private String major;
//	public Student () {
//		super();
//		System.out.println("Student 생성자 실행");
//	}

	/*
	 * public Student(String name, int age, String major) { super(name, age);
	 * //super.setName(name); //super.setAge(age); this.major = major;
	 * System.out.println("Student(name, age, major) 생성자 실행"); }
	 */
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	public String toString() {
		//return name + ":" + age + ":" + dept;
		//return this.getName() + ":" + this.getAge() + ":" + major;
		return super.toString() + ":" + major;
	}
}
