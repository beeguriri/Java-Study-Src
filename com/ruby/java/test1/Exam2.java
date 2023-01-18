package com.ruby.java.test1;

class sample {
//	private int a;			//private가 없으면 package내에서 사용 가능!
	int a;
}

public class Exam2 {

	public static void main(String[] args) {

		Exam2 ex = new Exam2();
		sample s = new sample();
		s.a = 10;
	}
}
