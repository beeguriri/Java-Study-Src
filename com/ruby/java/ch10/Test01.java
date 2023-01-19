package com.ruby.java.ch10;

import java.util.ArrayList;

public class Test01 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();									
		list.add("서울"); list.add("북경"); list.add("상해");	//데이터 넣는것 : add
		list.add("서울"); list.add("도쿄"); list.add("뉴욕");	//같은이름 중복해서 들어갈수 있다
		list.add("런던"); list.add("로마"); list.add("방콕");	
		list.add("북경"); list.add("도쿄"); list.add("서울");		
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));			//데이터 빼는것 : get
		}
		
		System.out.println("1 : " + list.toString());	

	}
}