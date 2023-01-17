package com.ruby.java.test1;			//패키지 선언

public class Armor {					//클래스 선언

	private String name;				
	private int height;					
	private int weight;
	private String color;
	private boolean isFly;
	
	public void speedUp(double value) {
		
		double speed =value;
		System.out.println(value);

	}
	
	
	public void speedUp(double value, int maxValue) {
		
		double speed = value;
		int maxSpeed = maxValue;

	}
	
	public void setHeight(int value) {	
		height = value;
	}
	
	public void setName() {
		String value = "mark6";
		name = value;
	} 
	
	public int takeOff() {					//반환값에 대한 타입 지정
		System.out.println("엔진 시동");
		return 0;							//반환값
	}
	
	public int takeOff(int value) {				
			System.out.println("엔진 시동 " + value);
			return value-50;
	} 
	
}











