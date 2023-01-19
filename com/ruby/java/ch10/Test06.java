package com.ruby.java.ch10;

import java.util.HashMap;

public class Test06 {

	public static void main(String[] args) {

		String word[] = {"BUMBLEBEE", "HEAVEN", "ALTHOUGH", "WONDER"};
		
		String meaning[] = {"꿀벌과에 속하는 호박벌", "천국", "그럼에도 불구하고", "호기심이 들다"};
		
		HashMap<String, String> dic = new HashMap<String, String>();
		
		for(int i=0; i< word.length; i++) {
			dic.put(word[i], meaning[i]);		//word : key값
												//meaning : value값
		}
		
		System.out.println(dic);				//출력형태 {}
		System.out.println(dic.size());
		
		System.out.println(dic.keySet());		//출력형태 []
		System.out.println(dic.values());		//출력형태 []

		System.out.println("HEAVEN : " + dic.get("HEAVEN"));
		dic.replace("HEAVEN", "아주 행복한 감정");			 //replace : key의 value를 바꾼다
		System.out.println("HEAVEN : " + dic.get("HEAVEN"));
		
		
		
		//방법3번 많이 씀
		for(String key : dic.keySet()) {
			System.out.println(String.format("%s : %s", key, dic.get(key)));
		}
	}
}
