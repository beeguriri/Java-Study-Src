package com.ruby.java.ch12;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test01 {

	public static void main(String[] args) {
		
		//파일위치 : D:\HJ\java_test\edu
		//소스위치 : D:\HJ\java_test\edu\src\com\ruby\java\ch12

		try(FileInputStream fi = new FileInputStream("a.txt");
				FileOutputStream fo = new FileOutputStream("b.txt");) {
			
			int c = 0;
			while((c=fi.read())!=-1) {		//read() : 1byte 읽음
				fo.write(c);				//write()
			}
		}	catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("실행완료!");
	}
}
