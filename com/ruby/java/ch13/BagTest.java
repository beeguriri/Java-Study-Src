package com.ruby.java.ch13;

class Bag<T> {				//generic class
							//T에 Book, PencilCase를 넣는것을 인스턴스 생성이라고 한다
	private T thing;

	public Bag(T thing) {	//생성자
		this.thing = thing;
	}

	public T getThing() {
		return thing;
	}

	public void setThing(T thing) {
		this.thing = thing;
	}

	void showType() {
		System.out.println("T의 타입은 " + thing.getClass().getName());
	}
}

class Book {
}

class PencilCase {
}

class Notebook {
}

public class BagTest {

	public static void main(String[] args) {
		
		Bag<Book> bag = new Bag<>(new Book());					//bag 변수의 타입은 Bag<Book>
																//생성자가 Bag(T thing : 객체)이므로
		Bag<PencilCase> bag2 = new Bag<>(new PencilCase());
		Bag<Notebook> bag3 = new Bag<>(new Notebook());

		bag.showType();
		bag2.showType();
		bag3.showType();
		
//		bag = bag2;
//		Error! Type mismatch: cannot convert from Bag<PencilCase> to Bag<Book>
//		bag의 타입 : Bag<Book>, bag2의 타입 : Bag<PencilCase>
//      Bag는 generic type / Book, PencilCase : instance type
		
		
	}

}
