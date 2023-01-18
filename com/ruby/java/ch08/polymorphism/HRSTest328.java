package com.ruby.java.ch08.polymorphism;

public class HRSTest328 {
	/*
	 * public static void calcTax(Salesman s) {
	 * 
	 * } public static void calcTax(Consultant c) {
	 * 
	 * } public static void calcTax(Director d) {
	 * 
	 * }
	 */
	public static void calcTax(Employee e){
		e.calcBonus();//동적 바인딩
	}
	public static void main(String[] args) {

		Salesman s = new Salesman();
		Consultant c = new Consultant();
		Director d = new Director();
		
		s.calcBonus();
		c.calcBonus();
		d.calcBonus();

		calcTax(s);
		calcTax(c);
		calcTax(d);
		if (s.equals(c)) {
			System.out.println("same object");
		}
		else {
			System.out.println("different object");
		}
		
		System.out.println(s.toString());
		System.out.println(c.toString());
		System.out.println(d.toString());
		
		Salesman s2 = s;
		if (s.equals(s2)) {
			System.out.println("same object");
		}
		else {
			System.out.println("different object");
		}
		System.out.println(s.toString());
		System.out.println(s2.toString());

		Employee e = new Salesman();
		Object o = new Salesman();
		//Director d1 = new Salesman();
		
		Object m1 = new Manager();
		Employee m2 = new Manager();
		Manager m3 = new Manager();
		//Director m4 = new Manager();
		
	}
}

