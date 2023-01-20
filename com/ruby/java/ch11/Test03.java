package com.ruby.java.ch11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test03 {		//a.txt가 없으므로 에러

	public static void main(String[] args) throws FileNotFoundException, IOException {

		try(FileInputStream fi = new FileInputStream("a.txt")){
			
			int c = fi.read();
			System.out.println((char) c);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
