package com.ruby.java.ch10;

import java.util.HashMap;

public class Test07 {

	public static void main(String[] args) {

		HashMap<String, String> dic = new HashMap<String, String>();
		
		
		dic.put("고진감래", "고생 끝에 즐거움이 옴");
		dic.put("분골쇄신", "몸이 부서질 정도로 노력을 다 함");
		dic.put("권토중래", "실패를 발판 삼아 재기함");
		dic.put("교학상자", "가르치고 배우면서 서로 성장함");
		
		dic.put(null, null);	//HashMap은 null값 저장가능
		
		System.out.println(dic);				//매칭되어있는 키와 value값 출력
		System.out.println("==========");
		System.out.println(dic.keySet());		//키 목록 출력
		System.out.println(dic.get("고진감해"));	//선언되지않은 키를 넣으면 null값 출력
		System.out.println(dic.get("고진감래"));   //키가 가지고 있는 value값 출력	

		
	}

}
