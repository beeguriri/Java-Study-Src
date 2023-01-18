
package com.ruby.java.ch08.polymorphism;

public class HRSTest351 {

	public static void calcTax(Employee e) {
		if (e instanceof Salesman) {
			System.out.println("Salesman 입니다.");
		} else if (e instanceof Manager) {
			System.out.println("Manager 입니다.");
		} else if (e instanceof Consultant) {
			System.out.println("Consultant 입니다.");
		} else {
			System.out.println("Employee 입니다.");
		}
	}

	public static void main(String[] args) {
		Salesman s = new Salesman();
		Manager m = new Manager();
		Consultant c = new Consultant();

		calcTax(s);
		calcTax(m);
		calcTax(c);
	}
	
}
