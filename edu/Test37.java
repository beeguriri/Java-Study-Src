package edu;

public class Test37 {

	public static void main(String[] args) {
		
		int[] score = {90, 85, 66, 100, 98};
		
		int sum = 0;			
		double avg = 0.00;		
		int max = 0;			
		int min = 100;			
		
		for(int i=0; i<score.length; i++) {
			
			sum += score[i];
			
			if(max < score[i])
				max = score[i];
			
			if(min > score[i])
				min = score[i];
		}
		
		avg = (double) (sum / score.length);
				
		System.out.println("총   점 : " + sum);
		System.out.println("평   균 : " + String.format("%.2f", avg));
		System.out.println("최 댓 값 : " + max);
		System.out.println("최 솟 값 : " + min);
		
	}
	
}
