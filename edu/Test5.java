package edu;

public class Test5 {
	
	public static void main(String[] args) {
		
		int a = 10;
		a++;                       
		System.out.println(a);     
		++a;
		System.out.println(a);
		
		int b = 10;
		b--;
		System.out.println(b);
		--b;
		System.out.println(b);
		
		int c = 10;
		int d = 10;
		System.out.println(++c);     //11
		System.out.println(d++);     //10
		System.out.println(d++);     //11
		
	}
}