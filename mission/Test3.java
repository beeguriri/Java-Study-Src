package mission;

public class Test3 {

	public static void main(String[] args) {
		
/*		long total;
		long m5 = 50000;
		long m1 = 10000;
		long t5 = 5000;
		long t1 = 1000;
		int m5_c=0;
		int m1_c=0;
		int t5_c=0;
		int t1_c=0;
		
		total = 152365;
				
		m5_c = (int) (total / m5);
		total = total % m5;
		System.out.printf("5만원 * %d장\n",m5_c);
		
		m1_c = (int) (total / m1);
		total = total % m1;
		System.out.printf("1만원 * %d장\n",m1_c);

		t5_c = (int) (total / t5);
		total = total % t5;
		System.out.printf("5천원 * %d장\n",t5_c);
		
		t1_c = (int) (total / t1);
		total = total % t1;
		System.out.printf("1천원 * %d장\n",t1_c);	*/
		
		int price=152365;
		int krw [] = {50000, 10000, 5000, 1000};
		int n;
		
		for(int k:krw) {
			n = price / k;
			price = price % k;
			System.out.println(k + "원권 * " + n +"장");
		}
		
	}

}
