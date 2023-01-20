package practice;

import java.util.Scanner;

public class Gugudan {	
	
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
		
		for (int i=2; i<=9; i+=col) {
			for(int j=1; j<=9; j++) {
				for(int k=0; k<col; k++) {	//column수만큼 나란히 출력
					
					if ((i+k)>9) {	//i+k값이 9보다 크면 루프중단
						break;
					}
					System.out.printf("%d * %d = %2d\t",(i+k),j,(i+k)*j);
				}
				System.out.println();
			}
			System.out.println();
		}
				
/*					if (k < col-1) System.out.println("\t");
					else		 	System.out.println("\n");	*/
				
			
		
		System.out.println("---------------");

		
	}
}
