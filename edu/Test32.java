package edu;

public class Test32 {
	
	public static void main(String[] args) {
		
		
//		int[] arr = {1,2,3,4,5};					//배열생성 및 초기화 
		
//		int[] score;								//변수선언 후
//		score = new int[] {90,85,75,100,95,60};		//배열생성 및 초기화 

		
		int[] arr = new int[20];
		
		 for(int i=0; i<arr.length; i++) {
		  
			 arr[i]=i*10; 
			 System.out.print(" " + arr[i]);

		 }
		 
//		for(int num : arr) {
//			 System.out.print(num + " ");
//		 }
		 
		 
		 
		
		/*
		 * arr[0]=10; // arr의 0번지에 '정수10' 저장 arr[1]=20; // arr의 0번지에 '정수20' 저장
		 * arr[2]=30; // arr의 0번지에 '정수30' 저장 arr[3]=40; // arr의 0번지에 '정수40' 저장
		 * arr[4]=50; // arr의 0번지에 '정수50' 저장
		 */
		
		/*
		 * System.out.println(arr[0]); // arr의 0번지 값 출력 = 10 System.out.println(arr[1]);
		 * // arr의 1번지 값 출력 = 20 System.out.println(arr[2]); // arr의 2번지 값 출력 = 30
		 * System.out.println(arr[3]); // arr의 3번지 값 출력 = 40 System.out.println(arr[4]);
		 * // arr의 4번지 값 출력 = 50
		 */
		
//		for (int i=0; i<5; i++)
//		System.out.print(" " + arr[i]);
//		System.out.println();
//		System.out.println();
//		for (int i=0; i<6; i++)
//		System.out.print(score[i]+", ");
		
	}
}