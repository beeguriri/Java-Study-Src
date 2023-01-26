package com.ruby.java.ch14;

interface MyFunc<T> {		//제네릭 인터페이스 
	T modify(T t);			//추상메서드 modify
}

public class Test06 {

	public static void main(String[] args) {

		MyFunc<String> mf1 = (str) -> str.toUpperCase() + " : " + str.length();
		
		//제네릭 String, 매개변수 str을 전달
        //toUpperCase() : 모든 str을 대문자로 반환
		//modify의 함수바디 : str.toUpperCase() + " : " + str.length();
		
		System.out.println(mf1.modify("java"));				//결과 : JAVA : 4
		System.out.println(mf1.modify("java programming"));	//결과 : JAVA PROGRAMMING : 16

		MyFunc<Integer> mf2 = (n) -> n * 2;
		
		//제네릭 Integer, 매개변수 정수 전달
		//modify의 함수바디 : (n) -> n * 2;
		
		System.out.println(mf2.modify(23));		//결과 : 46
		System.out.println(mf2.modify(42));		//결과 : 84
	}
}