package com.ruby.java.ch09;

public class MyObject {
	
	int num;	//접근제한자 : default (같은패키지 내 사용가능)
	
	MyObject(int num){			//생성자!
		this.num = num;
	}
	
	public String toString() {
	
	return "MyObject" + " : " + super.toString();
	
	//super. : MyObject의 상위클래스 호출 (선언 없으면 Object)
	
	}
	
	public boolean equals(Object obj) {		//파라미터가 Object로 받음
		
		boolean result = false;
		MyObject arg = (MyObject) obj;	//파라미터를 MyObject로 쓸수 있도록 타입캐스팅
		
		if(this.num == arg.num) {
			result = true;
		}
		
		return result;
	}
	
}
