package com.ruby.java.ch14;

interface MyInterface {
	public void print();
}

class MyClass1 implements MyInterface {
	@Override
	public void print() {
		System.out.println("MyClass1");
	}
}

class MyClass2 implements MyInterface {
	@Override
	public void print() {
		System.out.println("MyClass2");
	}
}

public class Test01 {
	
	static void test(MyInterface mi) {			//접근제어자 public 안써도 됨.  
		mi.print();
	}

	public static MyInterface test2() {			//public이면 패키지 내 다른 클래스에서 사용할 수 있음.
		
		MyInterface mi = new MyInterface() {	//test2() 메서드에서 구현 된 익명클래스
			@Override
			public void print() {
				System.out.println("test2()메서드에서 반환된 MyInterface");
			}
		};
		return mi;	//리턴값????
	}

	public static void main(String[] args) {	//메인함수는 무조건 public

		MyClass1 mc1 = new MyClass1();			//인터페이스 구현한 클래스 객체
		MyClass2 mc2 = new MyClass2();			//인터페이스 구현한 클래스 객체
		mc1.print(); 							//결과 : "MyClass1" 출력
		mc2.print(); 							//결과 : "MyClass2" 출력

		MyInterface mi = new MyInterface() {	//인터페이스 구현한 익명클래스 객체
			@Override
			public void print() {
				System.out.println("익명 클래스로 구현");
			}
		};
		
		mi.print(); 			//결과 : "익명 클래스로 구현" 출력

		test(mc1); 				//test메서드에서 매개변수를 mc1으로 받아 mc1.print() : "MyClass1" 출력
		test(mi); 				//test메서드에서 매개변수를 mi로 받아 mi.print() : "익명 클래스로 구현" 출력

		(new MyInterface() {
			@Override
			public void print() {
				System.out.println("선언, 생성, 호출을 한번에 처리");
			}
		}).print(); 			//결과 : "선언, 생성, 호출을 한번에 처리" 출력

		MyInterface mi2 = test2();		//mi2변수가 test2(); 메서드 호출
		mi2.print();					//결과 : " test2() 메서드에서 반환된 MyInterface" 출력
	}
}