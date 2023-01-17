package com.ruby.java.ch06;




public class Armor {

	private String name;
	private int height;
	
	public String getName() {		//String : 리턴 타입에 따라 메소드 타입 선정
		return name;
	}
	
	public void setName(String value) {		//void : 리턴값 없는 메소드
		name = value;
	}
	
	public int getHeight() {		//int : 리턴 타입에 따라 메소드 타입 선정
		return height;
	}
	
	public void setHeight(int value) {
		height = value;
	}

}
