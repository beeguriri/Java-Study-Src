package practice;

public class TestGugudan {
	
	
	public static void Gugudan() {
		
		for(int i=1; i<10; i++) {
			
			for(int j = 2; j<5; j++) {
			
			System.out.printf("%d * %d = %d\t",j,i,i*j);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=1; i<10; i++) {
			
			for(int j = 5; j<8; j++) {
			
			System.out.printf("%d * %d = %d\t",j,i,i*j);
			}
			System.out.println();
		}
		
		System.out.println();

		for(int i=1; i<10; i++) {
			
			for(int j = 8; j<10; j++) {
			
			System.out.printf("%d * %d = %d\t",j,i,i*j);
			}
			System.out.println();
		}
		
	}
	
	

	public static void main(String[] args) {

//		Gugudan gg = new Gugudan();
//		gg.printGugudan(2);
		
/*		for(int i=2 ; i<=4 ; i++) {
			
			for(int j=1; j<=9; j++) {
			
				System.out.printf("%d * %d = %d\n",i,j,i*j);
			}
		}*/
		
		Gugudan();

		
		
		
	}
}
