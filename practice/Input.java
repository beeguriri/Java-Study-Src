package practice;

import java.util.Scanner;

public class Input {
	
	public static void changeNum1(int inum) {
		
		int [] remainder = new int [10];	//나머지
		System.out.println("입력받은 수 : " + inum);
		
		int i = 0;
		while(inum>0) {

			remainder[i] = inum % 2;
			inum = inum / 2;
			i++;
		}
		
		System.out.print("2진수 출력 : ");
		
		for(i = remainder.length; i>0; i--) {
			
			System.out.print(remainder[i-1]);
			
		}
		
		System.out.println();
		
	}
	
	
	public static void changeNum2(int inum) {
		
		String remainder = "";	//나머지
		System.out.println("입력받은 수 : " + inum);
		
		int i = 0;
		while(inum>0) {

			remainder = inum % 2 + remainder;	//자바특성 +=의 반대연산 
			inum = inum / 2;
			i++;
			
		}
		
		System.out.println("2진수 출력 : " + remainder);
		
	}
	

	public static void main(String[] args) {
		
		//숫자를 입력받아서 2진수로 변환한 후 출력

		Scanner scanner = new Scanner(System.in);	//데이터입력
		int inum = scanner.nextInt();
		
		changeNum1(inum);
		changeNum2(inum);

	}
}
