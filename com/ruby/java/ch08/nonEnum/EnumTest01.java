package com.ruby.java.ch08.nonEnum;

enum Status {
	
/*	public static final int READY = 1;
	public static final int SEND = 2;
	public static final int COMPLETE = 3;
	public static final int CLOSE = 4; */
	
	READY, SEND, COMPLETE, CLOSE		//컴퓨터 내부적으로 문자들을 숫자화 함
}

public class EnumTest01 {
	public static void main(String[] args) {
		Status work = null;

		
		int n = 2;

		switch (n) {
		case 1:
			work = Status.READY;
			break;
		case 2:
			work = Status.SEND;
			break;
		case 3:
			work = Status.COMPLETE;
			break;
		case 4:
			work = Status.CLOSE;
			break;
		}

		System.out.println("현재 작업 상태 : " + work);
	}
}