package edu;

public class Test7 {
	
	public static void main(String[] args) {
		
		/* 타입캐스팅 연습 */
		
		byte a = 23;
		int b = a;
		System.out.println(b);
		
		byte c = 23;
		short d = 47;
		int e = 65;
		int f = c + d+ e;
		System.out.println(f);
		
		int g = 23;
		byte h = (byte)g;
		System.out.println(h);
		
		int i = 400;
		byte j = (byte)i;
		System.out.println(j);    //반환오류
		
		byte k = 100;
		byte l = 126;
		byte m = (byte)(k+l);
		System.out.println(m);    //반환오류
		
	}
}