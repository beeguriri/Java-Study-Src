package edu;

public class Test38_1 {
	
		public static void main(String[] args) {
			
			int[][] arr =new int[5][5];			
			
			for(int i=0; i < arr.length; i++) {   
				
				for(int j=0; j < arr[i].length; j++) {  
					
					double rnum = Math.random();		//난수생성
					int num = (int) (rnum * 10);		//*10 : 0.xx -> 정수로
					arr[i][j] = num++;
					
					System.out.print(arr[i][j] + "\t");
			
				}
				
			System.out.println("\n");
			
			}
		
		}

}
