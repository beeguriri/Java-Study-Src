/*package mission;

public class Test2 {

	public static double gravity=9.81;
	double in_vel;
	double in_dis;
	double distant;
	int time;
	
class Input {
	
	public void setIn_Dis(double value) { //초기위치(in_dis)저장
		in_dis = value;
	}
	
	public void setIn_Vel(double value) { //초기속도(in_vel)저장
		in_vel = value;
	}
	
	public void setDis(double value) {  //위치(distant) 저장
		distant = value;
	}
	
	public double getDis() {		//위치(distant) 리턴
		return distant;
	}
	
	public void setTime(int value) {	//시간(time)저장
		time = value;
	}
	
	public double getTime() {		//시간(time) 리턴
		return time;
	}
		
//계산하는걸 메소드로
	public double Cal() {
		distant = in_dis - (double)(0.5*gravity*time*time) + (double)(in_vel*time); 
		return distant;
	}
}

public class Test {

	public static void main(String[] args) {
		
//		Input result = new Input();
		
		result.setIn_Dis(1000);	//초기위치 입력
		result.setIn_Vel(0);	//초기속도 입력
		
		result.setTime(5);		//n초 후 입력
		
		result.Cal();			//method 호출
	}
//		System.out.println("%d초 후 위치 : %.2fm", result.getTime(), distant);
		
	
	}


}*/
