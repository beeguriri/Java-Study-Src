package com.ruby.java.ch13.boundGen;

class Bag<T extends Solid> {
	  private T thing;
	  private String owner;

	  public Bag(T thing) {
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

	  public String getOwner() {
	    return owner;
	  }

	  public void setOwner(String owner) {
	    this.owner = owner;
	  }

	  boolean isSameOwner(Bag<?> obj) {
//	  boolean isSameOwner(Bag<T> obj) {			타입이 다르므로 허용하려면 T -> ?(와일드카드)로 바꿔줌
	    if(this.owner.equals(obj.getOwner()))
	      return true;
	    return false;
	  }
	}

	class Solid { }
	class Liquid{ }

	class Book extends Solid{ }
	class PencilCase extends Solid{ }
	class Notebook extends Solid { }

	class Water extends Liquid{ }
	class Coffee extends Liquid{ }


	public class BagTest {

	  public static void main(String[] args) {
	    Bag<Book> bag = new Bag<>(new Book());
	    Bag<PencilCase> bag2 = new Bag<>(new PencilCase());

	    bag.setOwner("김푸름");
	    bag2.setOwner("김푸름");

	    boolean result = bag.isSameOwner(bag2);						//bag과 bag2의 타입이 다름
	    if(result) System.out.println("소유자가 동일합니다.");
	    else System.out.println("소유자가 다릅니다.");
	  }
	}