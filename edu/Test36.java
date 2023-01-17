package edu;

public class Test36 {
		
	public static void main(String[] args) {
			
		char letter = 'A';
		char[] alphabet = new char[100];
		
		for(int i=0; i<alphabet.length; i++) {
			
			alphabet[i] = (char) (letter + i);
			System.out.print(" " + alphabet[i]);
			
			// char + int 연산결과는 int 타입
			// char 타입으로 캐스팅 필요 
		}
		
//		for(char c : alphabet) {
//			System.out.print(" " + c);
			
			// 확장for문으로 출력
			
//		}

	}
}
