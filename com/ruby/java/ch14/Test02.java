package com.ruby.java.ch14;

interface Multiply {
	
	double getValue();	//메서드 하나
}

public class Test02 {

	public static void main(String[] args) {

		Multiply m;
		
		m = () -> 3.14 * 2;					
								// 익명클래스, 객체 생성 : new Multiply
								// 함수바디 구현하고 : getValue() { return 3.14 * 2 }
								// 3.14*2가 getValue()의 함수바디
		
		System.out.println(m.getValue());	// 출력 : 6.28

		m = () -> 10 * 3;
		System.out.println(m.getValue());
	}
}
