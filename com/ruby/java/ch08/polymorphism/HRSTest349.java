
package com.ruby.java.ch08.polymorphism;

abstract class Employee extends Object{		//extends Object : 생략해도 컴파일 시 자동으로 삽입
	String name;
	int salary;

	public abstract void calcSalary();

	public abstract void calcBonus();
}

class Salesman extends Employee {
	int annual_sales;
	public void calcSalary() {
		System.out.println("Salesman 급여 = 기본급 + 판매 수당");
	}

	public void calcBonus() {
		System.out.println("Salesman 보너스 = 기본급 * 12 * 4");
	}
}

class Consultant extends Employee {
	int num_project;
	public void calcSalary() {
		System.out.println("Consultant 급여 = 기본급 + 컨설팅 특별 수당");
	}

	public void calcBonus() {
		System.out.println("Consultant 보너스 = 기본급 * 12 * 2");
	}
}

class Manager extends Employee {
	int num_team;
	public void calcSalary() {
		System.out.println("Manager 급여 = 기본급 + 팀 성과 수당");
	}
	public void calcBonus() {
		System.out.println("Manager 보너스 = 기본급 * 12 * 2");
	}
}

class Director extends Manager {
	public void calcBonus() {
		System.out.println("Director 보너스 = 기본급 * 12 * 6");
	}
}
public class HRSTest349 {		//클래스는 필드와 메서드 정의 가능!

	static void calcTax(Employee e) {					//같은 클래스에서 호출하므로 public 생략 가능
														//static 생략하면 "cannot make a static reference
														//해결방법 : 객체를 만들고 호출하면 됨
		
														//Object e도 테스트
		System.out.println("소득세를 계산합니다.");
		if (e instanceof Salesman) {
			System.out.println("Salesman 객체");
			//System.out.println(e.annual_sales);//not visible
		} else if  (e instanceof Manager) {
			Manager m = (Manager) e;//down casting
			System.out.println("Manager 객체");	
			System.out.println(m.num_team);
		} else if  (e instanceof Consultant) {
			System.out.println("Consultant 객체");		
		} else {
			System.out.println("Employee 객체");	
		}
	}
	
/*	public static void calcTax(Salesman s) {
		
	}
	
	public static void calcTax(Consultant c) {
		
	}

	public static void calcTax(Director d) {
	
	}*/
	
	

	public static void main(String[] args) {
		//교재 349 array를 사용한 polymorphism 구현
		Salesman s = new Salesman();
		System.out.println(s.toString());
		Consultant c = new Consultant();
		Director d = new Director();
		Employee s2 = new Salesman();
		Employee s3 = new Salesman();
		Employee m1 = new Manager();
		Employee m2 = new Manager();
		Manager m3 = new Manager();
		
		if(s.equals(m3)) {
			System.out.println("s == m3");
		} else {
			System.out.println("s != m3");
		}
		
		//Object arr[] = new Salesman[6];
		Employee arr[] = new Employee[6];
		//Object arr[] = new Manager[6];
		//Object arr[] = new Object[6];
		arr[0] = s;
		arr[1] = s2;
		arr[2] = s3;	
		arr[3] = m1;	//실행시간에 동적 바인딩으로 arr[3]의 타입이 Salesman
		arr[4] = m2;
		arr[5] = m3;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			calcTax(arr[i]);
		}
		
//		HRSTest349 ht = new HRSTest349();		메서드의 static 생략했을때 해결방법
//		ht.calcTax(s1);							-> 객체 생성
		
		calcTax(s);
		calcTax(c);
		calcTax(d);

	}
}
