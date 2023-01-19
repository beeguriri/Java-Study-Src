package practice;

import java.util.Scanner;

public class Gugudan {	//수정중
	
	public static void main(String[] args) {

		int col;
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("column : ");
			col = scanner.nextInt();
		}	catch (Exception e) {
			return;
		}
		
		System.out.println("====================");
		
/*		if (col < 1 || 9 < col) {
			System.out.println("col is not valid!");
			return;
		}*/
		
		for(int i=2; i<=9; i+=col) {
			for(int j=1; j<=9; j++) {
				for(int k=0; k<col; k++) {
				
					if(10 <= i+k) {						//내가 정한 마지막코드까지만 (9단까지만...)
						System.out.println("\n");
						break;
					}
					
					System.out.printf("%d * %d = %2d", (i+k), j, (i+k)*j);
				
					if (k < col-1) System.out.println("\t");
					else		 	System.out.println("\n");	
				}
			}
		
		System.out.println("---------------");

		}
	}
}
