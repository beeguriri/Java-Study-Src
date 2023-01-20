package com.ruby.java.ch11;

import java.io.FileInputStream;
import java.io.IOException;

public class Test04 {

/*
	public static void main(String[] args) {

		try {
			FileInputStream fi = new FileInputStream("a.txt");
			int c = fi.read();
			System.out.println((char)c);
			
		} catch (Exception e) {
			e.printStackTrace();
		}			

	} 
*/

/*	
	public static void main(String[] args) throws IOException {

		FileInputStream fi = new FileInputStream("a.txt");
		int c = fi.read();
		System.out.println((char)c);				

	}
	
*/
	public static void test() throws IOException {	//예외처리는 메서드 호출한 곳에서 처리하겠다!
		
		FileInputStream fi = new FileInputStream("a.txt");
		int c = fi.read();
		System.out.println(c);
		
		
/*		try {
			FileInputStream fi = new FileInputStream("a.txt");
			int c = fi.read();
			System.out.println(c);
		} catch (Exception e) {
		}
*/
	}
	
	
	public static void main(String[] args)  {
		try {										//메서드 호출한 곳에서 예외 처리
		test();
		} catch(Exception e) {
			System.out.println("파일이 없습니다.");
		}
	}
}

