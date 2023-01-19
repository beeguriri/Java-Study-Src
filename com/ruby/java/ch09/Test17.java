package com.ruby.java.ch09;

import java.util.Calendar;		//import 단축키 : Ctrl + shift + "O"
import java.util.Date;

public class Test17 {

	public static void main(String[] args) throws InterruptedException {	//예외처리

		Date d = new Date();					//date는 local 반영하지 못함
		System.out.println(d);					//현재 컴퓨터 날짜, 시간
		
		Calendar c = Calendar.getInstance();	//local시간 반영 가능 (TimeZone...메서드 사용)
	
/*		System.out.println(c.get(Calendar.YEAR));			
		System.out.println(c.get(Calendar.MONTH) + 1);	//MONTH는 0~11의 정수값 가짐
		System.out.println(c.get(Calendar.DAY_OF_MONTH));	
		System.out.println(c.get(Calendar.HOUR));			
		System.out.println(c.get(Calendar.MINUTE));		 */	

		System.out.println("현재시간 : " + c.get(Calendar.YEAR)+"년 "
						+(c.get(Calendar.MONTH) + 1)+"월 "
						+c.get(Calendar.DAY_OF_MONTH)+"일 "
						+c.get(Calendar.HOUR)+"시 "
						+c.get(Calendar.MINUTE)+"분 "
						+c.get(Calendar.SECOND)+"초"+"\n");
		
		System.out.println("****전자시계 만들기****");
		
		for(int i=0; i<10; i++) {
			
			Calendar c1 = Calendar.getInstance();
			System.out.println(c1.get(Calendar.YEAR)+"년 "
							+(c1.get(Calendar.MONTH) + 1)+"월 "
							+c1.get(Calendar.DAY_OF_MONTH)+"일 "
							+c1.get(Calendar.HOUR)+"시 "
							+c1.get(Calendar.MINUTE)+"분 "
							+c1.get(Calendar.SECOND)+"초");
			
			Thread.sleep(1000);		//1000ms (1s) 지연
			
		}
	}
}

