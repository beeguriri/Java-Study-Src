package edu;

public class Test38 {
	
	public static void main(String[] args) {
		
		int[][] arr =new int[5][5];			//5x5 행렬 생성
		int num = 1;
		
		for(int i=0; i < arr.length; i++) {   //행의길이반큼 반복
			
			for(int j=0; j < arr[i].length; j++) {  //열의길이만큼 반복
				
				arr[i][j] = num++;
				System.out.print(arr[i][j] + "\t");		//탭띄우기
//				System.out.print("\t");
			}
			
			System.out.println("\n");				//줄띄우기
		}
		
//		for(int i=0; i<arr.length; i++) {
//
//			for(int j=0; j<arr[i].length; j++) {
//				System.out.print(arr[i][j]);
//				System.out.print("\t");
//			}
//			
//			System.out.println("\n");
//		}
		
	}
}
