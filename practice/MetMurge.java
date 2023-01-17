package practice;

public class MetMurge {

	
	//printArry : 행렬 출력 메서드 
	public static void printArray(int[] arr) {
		for(int i=0; i < arr.length; i++) {
			
				System.out.print(arr[i] + " ");
		}
		System.out.println();
	}	
	
	//merge : 행렬 합치는 메서드
	
	
/*	public static void merge(int arr[]) {
		
		int [] c = new int [20];
		
		
		
	} */
	
	
	public static void main(String[] args) {

		int [] a = {1, 3, 5, 7, 9};
		int [] b = {2, 4, 6, 8, 10};
		
		int [] c = new int [a.length + b.length];

		for (int i = 0; i < a.length; i++) {
	        c[i] = a[i];
	    }

	    for (int i = 0; i < b.length; i++) {
	        c[i + a.length] = b[i];
	    }

	    for (int i : c) {
	        System.out.print(c[i]);
	    }
			
		
	
	}
		
}
