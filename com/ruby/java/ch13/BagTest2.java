package com.ruby.java.ch13;
										//같은 패키지 내에서는 클래스 공통으로 쓸수 있으므로 이름 다르게..!
class Bag2 {							//제네릭을 사용하지않고 일반클래스로 선언
	
	private Object thing;				//변수 thing의 type을 Object(최상위클래스) -> Book2, PencilCase2,...의 변수 가질 수 있음

	public Bag2(Object thing) {
		this.thing = thing;
	}

	public Object getThing() {			//return type이 Object
		return thing;
	}

	public void setThing(Object thing) {
		this.thing = thing;
	}

	void showType() {
		System.out.println("T의 타입은 " + thing.getClass().getName());
	}
}

class Book2 {				
}

class PencilCase2 {
}

class Notebook2 {
}

public class BagTest2 {

	public static void main(String[] args) {
		Bag2 bag = new Bag2(new Book2());
		Bag2 bag2 = new Bag2(new PencilCase2());
		Bag2 bag3 = new Bag2(new Notebook2());

		bag.showType();
		bag2.showType();
		bag3.showType();
		
		bag = bag2;		//error를 발생시키지 않지만 논리적 모순이 있으므로 잘못된 코드이다 
		
		/*
		Book book = bag.getThing();
		PencilCase pc = bag2.getThing();
		Notebook nb = bag3.getThing();
		*/
		
		//typecasting
		Book book = (Book)bag.getThing();
		PencilCase pc = (PencilCase)bag2.getThing();
		Notebook nb = (Notebook)bag3.getThing();
	}
}
