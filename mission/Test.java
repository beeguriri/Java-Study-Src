package mission;

import com.ruby.java.ch06.Armor;

public class Test {

	public static void main(String[] args) {
		
		double distant=0;
		double gr = 9.81;
		double acc=gr;
		int time=0;
		double in_vel=0;
		double in_dist=0;

		time = 5;
		in_dist = 1000;
		distant = in_dist - ((0.5*acc*time*time) + (in_vel*time)); //자유낙하이므로
		
		System.out.printf("%d초 후 위치 : %.2fm",time,distant);
	
	}

}
