package com.ruby.java.ch07.abstraction;

public interface Messenger {

	public static final int MIN_SIZE = 1;			//fianl : 변경 못함
	public static final int MAX_SIZE = 104857600;	//static : 코드영역변수, 인스턴스 생성없이 사용

	public abstract String getMessage();

	public abstract void setMessage(String msg);	//abstract 메서드는 함수바디X, 함수이름, 파라미터, 리턴타입 통일

	public default void setLogin(boolean login) {	//인터페이스 사용하는 모든클래스 공통기능, 함수바디O
		log();
		if (login) {
			System.out.println("로그인 처리합니다.");
		} else {
			System.out.println("로그아웃 처리합니다");
		}
	}

	public static void getConnection() {
		System.out.println("network에 연결합니다.");
	}

	private void log() {
		System.out.println("start job!");
	}
}