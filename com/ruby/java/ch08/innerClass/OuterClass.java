package com.ruby.java.ch08.innerClass;

public class OuterClass {
	static class InstanceClass {
		static int a;
		
		void method2() {
			System.out.println("Instance Class : " + a);
		}
	}
	
	static class StaticClass {				//static으로 선언한 내부 class
		int b;
		static int c;
		void method3() {
			System.out.println("Static Class : "+ b);
		}
		
		static void method4() {
			System.out.println("Static Class: " + c);
		}
	}
	
	public void method1() {
		class LocalClass {
			int d;
			void method5() {
				System.out.println("Local Class : " + d);
				//System.out.println(a);
			}
		}
		LocalClass inner = new LocalClass();
		InstanceClass ic = new InstanceClass();
		inner.d = 1004;
		inner.method5();
		System.out.println(ic.a);
	}

}
