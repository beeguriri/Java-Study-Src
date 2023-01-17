package edu;

public class Test38_2 {
	
	public static void main(String[] args) {
		
		int[][] a = new int[3][4];
		int[][] b = new int[4][5];
//		int[][] c = new int[5][5];
		int[][] d = new int[3][5];
		
		
		/* a행렬 생성 */
		System.out.println("< 행렬 a >");
		
		for(int i=0; i < a.length; i++) {   
			
			for(int j=0; j < a[i].length; j++) {  
				
				double rnum = Math.random();		
				int num = (int) (rnum * 10);		
				a[i][j] = num++;
				System.out.print(a[i][j] + "\t");
			}
		System.out.println("");
		}
		
		
		/* b행렬 생성 */
		System.out.print("\n");
		System.out.println("< 행렬 b >");
		
		for(int i=0; i < b.length; i++) {   
			
			for(int j=0; j < b[i].length; j++) {  
				
				double rnum = Math.random();		
				int num = (int) (rnum * 10);		
				b[i][j] = num++;
				
				System.out.print(b[i][j] + "\t");
			}
		System.out.println("");
		}

		
		/* c행렬 = a+b 생성 */
//		System.out.print("\n");
//		System.out.println("< 행렬 c >");
		
//		for(int i=0; i < c.length; i++) {   
//			
//			for(int j=0; j < c[i].length; j++) {  
//				
//				c[i][j] = a[i][j] + b[i][j];
//				
//				System.out.print(c[i][j] + "\t");
//			}
//		System.out.println("");
//		}
		
	
		/* d행렬 = a*b 생성 */
		System.out.print("\n");
		System.out.println("< 행렬 d >");
		
		for(int i=0; i < a.length; i++) {   
			
			for(int j=0; j < b[i].length; j++) {  
				
				for(int k=0; k < b.length; k++) { //또는 a[i].length 만큼 연산
					
				d[i][j] += a[i][k] * b[k][j];
				
				}
				
				System.out.print(d[i][j] + "\t");
		
			}
			
			System.out.println("");

		}
	
	}

}
