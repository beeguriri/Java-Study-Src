package com.ruby.java.ch07.inheritance;
public class LMSTest {
	public static void main(String[] args) {
	    Employee e = new Employee();
		Professor p = new Professor();
		Student s = new Student();
	/*
	 * Employee e = new Employee("홍봉희", 10, "영업"); Professor p = new
	 * Professor("홍길동", 20, "광고"); Student s = new Student("홍길순", 30, "코딩");
	 */	
		
		System.out.println(e.toString());
		System.out.println(p.toString());
		System.out.println(s.toString());
		
		e.setName("오정임");
		e.setAge(47);
		e.setDept("입학처");

		p.setName("김푸름");
		p.setAge(52);
		p.setSubject("빅데이터");

		s.setName("김유빈");
		s.setAge(20);
		s.setMajor("컴퓨터과학");

		System.out.println(e.toString());
		System.out.println(p.toString());
		System.out.println(s.toString());
	}
}

