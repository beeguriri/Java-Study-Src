package com.ruby.java.ch08.innerClass;

public class OuterClassTest {

	public static void main(String[] args) {
		
		OuterClass outer = new OuterClass();
		OuterClass.InstanceClass inner01 = outer.new InstanceClass();
								// InstanceClass가 Private로 선언되어있으면 사용불가
		inner01.a = 123;
								// InstanceClass 내 변수a Private로 선언되어있으면 사용불가

		inner01.method2();		// InstanceClass 내 메서드가 Private로 선언되어있지않으므로 사용가능
		
		
		OuterClass.StaticClass inner02 = new OuterClass.StaticClass();
								
		inner02.b = 456;
		inner02.method3();
		OuterClass.StaticClass.c = 789;			// StaticClass가 static으로 선언되어있으므로 
		OuterClass.StaticClass.method4();		// 변수, 메서드 인스턴스 생성없이 사용 가능

		outer.method1();
	}

}
