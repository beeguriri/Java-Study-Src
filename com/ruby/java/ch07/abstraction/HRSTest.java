package com.ruby.java.ch07.abstraction;

abstract class Employee {				//추상클래스 선언
	String name;
	int salary;

	public abstract void calcSalary();	//추상메서드1 선언
	public abstract void calcBonus();	//추상메서드2 선언
}

class Salesman extends Employee {
	public void calcSalary() {
		System.out.println("Salesman 급여 = 기본급 + 판매수당");
	}

	public void calcBonus() {
		System.out.println("Salesman 보너스 = 기본급 * 12 * 4");
	}
}

class Consultant extends Employee {
	public void calcSalary() {
		System.out.println("Consultant 급여 = 기본급 + 컨설팅 특별 수당");
	}

	public void calcBonus() {
		System.out.println("Consultant 보너스 = 기본급 * 12 * 2");
	}
}

abstract class Manager extends Employee {	//추상메서드로 선언된 메서드2개가 다 있어야 일반클래스
											//추상메서드로 선언된 메서드 중 1개만 있으므로
											//Manager의 클래스는 추상클래스
	public void calcSalary() {
		System.out.println("Manager 급여 = 기본급 + 팀 성과 수당");
	}
}

class Director extends Manager {
	public void calcBonus() {
		System.out.println("Director 보너스 = 기본급 * 12 * 6");
	}
}

public class HRSTest {		// 한 파일에 여러개 클래스 있을경우, 
							// main메서드 있는 클래스만 public 붙여줌
	public static void main(String[] args) {
		Salesman s = new Salesman();
		Consultant c = new Consultant();
		Director d = new Director();
		s.calcSalary();
		c.calcSalary();
		d.calcSalary();
	}
}
