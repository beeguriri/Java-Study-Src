package com.ruby.java.test1;

/*class Armor2{									//public은 한 패키지 내 1개만 사용
	private String name;
	private int height;		
	
	public int takeOff(int value) {				인자 받는 매개변수(parameter),
												  지역변수(local variable)
		System.out.println("엔진 시동 " + value);
		return value-50;

	}
	
} */


public class TestArmor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int n;
		Armor a = new Armor();		
		
//		n = a.takeOff(100);
		
		a.speedUp(80);
														
//		System.out.println("n = " + n);
		
	}
	

}	
































