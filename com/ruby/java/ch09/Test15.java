package com.ruby.java.ch09;

import java.util.Random;

public class Test15 {

	public static void main(String[] args) {

		//입력중
		
		Random r1 = new Random();

		for (int i = 0; i < 5; i++) {
			
			System.out.println("\t");
			System.out.println("\t");
			System.out.println("\t");
			
		}
		
		
		
		Random r2 = new Random(123);		//로또번호 랜덤생성 하는거 만들어보기 ㅋㅋ 123 -> 47? (번호갯수)
		for(int i = 0; i < 5; i++) {		//번호 몇개 추첨할건지(루프 몇번 돌건지) i : 5 -> 7?
			System.out.println(r2.nextInt(10));
		}
	}
}
