package com.ruby.java.ch08.innerClass;

public class MyLinkedList {

	private Node head = null;

	private class Node {
		private String data;			//private String data: Class내부에서 쓸수있는 변수지만
		private Node link;				//MyLinkedList 클래스 내부의 멤버클래스 이므로 사용 가능?

		public Node(String data) {
			this.data = data;
		}
	}

	public void add(String data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node next = head; 
			while (next.link != null) {
				next = next.link;
			}
			next.link = newNode;
			
		}
	}

	public void print() {
		if (head == null) {
			System.out.println("등록된 데이터가 없습니다.");
		} else {
			System.out.println("등록된 데이터는 다음과 같습니다.");
			Node next = head;
			while (next != null) {
				System.out.println(next.data);
				next = next.link;
			}
		}
	}
}