package com.ruby.java.test1;

public class Exam1 {

	class sample {
		private int a;
	}

	public static void main(String[] args) {

//		sample ex1 = new sample();	//내부클래스에 바로 접근 불가
		
		Exam1 ex = new Exam1();				//멤버클래스(내부클래스) 사용하려면 Exam1의 객체 생성하고
		Exam1.sample s = ex.new sample();	//클래스 사용할 수 있음
		s.a = 10;
	}
}
