package com.ruby.java.ch07.abstraction;
class PhoneMessenger implements Messenger {		//Messenger : 인터페이스
	String name;
	public String getMessage() {
		return "Phone" + name;
	}

	public void setMessage(String msg) {
		name = msg;
	}
	
}
class GalaxyMessenger implements Messenger {
	String name;
	public String getMessage() {
		return "galaxy" + name;
	}

	public void setMessage(String msg) {
		name = msg;
		System.out.println("galaxy 메시지 설정" + msg);
	}
	public void changeKeyBoard() {
		System.out.println("키보드 변경");
	}
}

public class MessengerTest {
	//인터페이스 polymorphism 교재 347페이지 구현
	
	static void show(Messenger m) {
		System.out.println(m.getMessage());
	}
	
	public static void main(String[] args) {

		String st;
		PhoneMessenger pm = new PhoneMessenger();
		PhoneMessenger gm = new PhoneMessenger();
		pm.setMessage("hong");
		st = pm.getMessage();
		System.out.println("message = " + st);
		show(pm);
		show(gm);
		
		GalaxyMessenger galaxy = new GalaxyMessenger();
		galaxy.getMessage();
		galaxy.setMessage("hi");
		galaxy.changeKeyBoard();
		
		Messenger test = new Messenger() {		//인터페이스를 익명으로 사용한 예제
			public void setMessage(String msg) {
				System.out.println("익명 클래스 메시지 : "+ msg);
			}
			public String getMessage() {
				return "test";
			}
		};
				
	}
}
