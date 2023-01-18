package com.ruby.java.ch08.nonEnum;

enum Mandarin {
	금귤(600), 한라봉(500), 레드향(300), 천혜향(400), 황금향(800);

	private int price;

	Mandarin(int p) {
		price = p;
	}

	int getPrice() {
		return price;
	}
}

public class EnumTest02 {
	public static void main(String[] args) {
		
		Mandarin ma = Mandarin.한라봉;
		System.out.println("이름: "+ ma.name());
		System.out.println("순서: "+ ma.ordinal());	
		System.out.println("황금향과 비교: "+ ma.compareTo(Mandarin.레드향));
		
		Mandarin ma2 = Mandarin.valueOf("레드향");
		System.out.println(ma2);
		
		if (ma == Mandarin.한라봉)
			System.out.println("ma는 한라봉입니다.");
		System.out.println(ma + " 가격 : " + ma.getPrice());

		Mandarin list[] = Mandarin.values();
		System.out.println("== 귤의 종류 ==");
		for (Mandarin m : list)
			System.out.println(m + ":" + m.getPrice());
	}
}