package edu;

public class Test2 {
	
	public static void main(String[] args) {
		
		int depositAmount1;
		int depositAmount2;

		depositAmount1 = 80000;
		depositAmount2 = 10000;
		
		System.out.println(depositAmount1);    //ln : line
		System.out.println(depositAmount2);
		
		System.out.print(depositAmount1);      //줄바꿈 안됨
		System.out.print(depositAmount2);
		System.out.println("");

		System.out.printf("%d", depositAmount1);  //f : format, 줄바꿈 안됨
		System.out.printf("%d", depositAmount2);
		System.out.println("");

		System.out.printf("%d\n", depositAmount1);  // \n 라인바꿈
		System.out.printf("%d\n", depositAmount2);
				
	}
}