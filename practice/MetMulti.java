package practice;

public class MetMulti {

	public static void printArray(int[][] arr) {
		for(int i=0; i < arr.length; i++) {
			for(int j=0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
		System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {

		int numa = 1;
		int numb = 5;
		
		int [][] a = new int [3][4];
		int [][] b = new int [4][3];
		int [][] c = new int [3][3];
		
		
		//행렬a 만들기
		
//		System.out.println("행렬 A");
		for(int i=0; i<a.length; i++) {
			
			for(int j=0; j<a[i].length; j++) {
				
				a [i][j] = numa++;
//				System.out.print(a [i][j] + "\t");
			}
			
//			System.out.println();
			
		}
		
		//행렬b 만들기

//		System.out.println("\n행렬 B");
		for(int i=0; i<b.length; i++) {
					
			for(int j=0; j<b[i].length; j++) {
						
				b [i][j] = numb++;
//				System.out.print(b [i][j] + "\t");
			}
			
//			System.out.println();
		}
		
		//행렬 AxB
		
//		System.out.println("\n행렬 A * B");
		
		for(int i=0; i<a.length; i++) {
					
			for(int j=0; j<b[0].length; j++) {
						
				for(int k=0; k<b.length; k++) {
					
					c [i][j] += a [i][k] * b [k][j];
		
				}
//				System.out.print(c [i][j] + "\t");
				
			}
//			System.out.println();		
		}
		
		System.out.println("행렬 A");
		printArray(a);
		System.out.println("행렬 B");
		printArray(b);
		System.out.println("행렬 A*B");
		printArray(c);
		
	}

}
