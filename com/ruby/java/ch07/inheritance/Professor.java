package com.ruby.java.ch07.inheritance;
public class Professor extends Person {
	private String subject;
//	public Professor() {
//		super();
//		System.out.println("Professor 생성자 실행");
//	}

	/*
	 * public Professor(String name, int age, String subject) { super(name, age);
	 * //super.setName(name); //super.setAge(age); this.subject = subject;
	 * System.out.println("Professor(name, age, dept) 생성자 실행"); }
	 */
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String toString() {
		//return name + ":" + age + ":" + dept;
		//return this.getName() + ":" + this.getAge() + ":" + subject;
		
		return  super.toString()+ ":" + subject;
	}
}
