package com.ruby.java.ch07.inheritance;

public class Person {
	private final String ssn_ID = "1234";
	// private final String ssn_ID";
	private String name;
	private int age;

	/*
	 * public void setssn_ID(String ssn_ID) { this.ssn_ID = ssn_ID; }
	 */
	public Person() {
		System.out.println("Person 생성자 실행");
	}

	/*
	 * public Person(String ssn_ID) { this.ssn_ID = ssn_ID; }
	 */
	/*
	 * public Person(String name, int age) { this.name = name; this.age = age; }
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	/*
	 * public final String toString() { return name + ":" + age; }
	 */
	
	 public String toString() { return name + ":" + age; }
	 
}
