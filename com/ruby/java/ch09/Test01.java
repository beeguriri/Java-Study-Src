package com.ruby.java.ch09;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = new Object();
		
		System.out.println(obj1.hashCode());	
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		
		//public final class System
		//public class PrintStream extends FilterOutputStream implements Appendable, Closeable
		//public static final InputStream in = null;
		
		//System 클래스(final) 내 printstream 클래스(static)의 out이라는 참조변수(static변수)
		//println : 메서드 호출
		//hashCode() : 메모리상의 내부주소 데이터
		

		System.out.println(obj1.getClass().getName());
		
		//Object라는 인스턴스의 getClass() 메서드의 getName()메서드 호출
		//메서드의 메서드의 메서드를 호출할 수 있다!
		
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		System.out.println(obj3.toString());

		//toString() : 해당 클래스의 이름 @ 16진수 hashCode를 return
		//return getClass().getName() + "@" + Integer.toHexString(hashCode());
		
/*		MyObject obj4 = new MyObject();
		System.out.println(obj4);

		//println : toString()이라는 메서드가 자동으로 호출 됨
		//MyObject 클래스에 메서드가 없으면 상위클래스(Object)의 메서드가 호출 됨
		//MyObject 클래스에 메서드가 있으면 해당클래스의 메서드가 호출 됨 (오버라이딩) */
				
		MyObject obj4 = new MyObject(123);
		MyObject obj5 = new MyObject(123);
		
		if(obj4.equals(obj5)) {					//객체는 다른데, 저장된 값이 같으므로 같다!
			System.out.println("동일 객체이다.");
		} else {
			System.out.println("다른 객체이다.");
		}
		
		if(obj4 == obj5) {						//두 객체의 해쉬코드를 비교하므로 다르다!
			System.out.println("동일 객체이다.");
		} else {
			System.out.println("다른 객체이다.");
		}
		
	}

}

