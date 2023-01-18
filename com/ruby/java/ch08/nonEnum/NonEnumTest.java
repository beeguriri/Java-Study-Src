package com.ruby.java.ch08.nonEnum;

/*class Status {
public static final int READY = 1;
public static final int SEND = 2;
public static final int COMPLETE = 3;
public static final int CLOSE = 4;
}*/

public class NonEnumTest {
public static void main(String[] args) {
	int work = 0;
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