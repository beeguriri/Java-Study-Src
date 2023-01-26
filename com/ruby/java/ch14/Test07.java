package com.ruby.java.ch14;

interface StringFunc {
	String modify(String s);
}

public class Test07 {

	static String test(StringFunc sf, String s) {
		return sf.modify(s);
	}

	public static void main(String[] args) {

		String str = "Korea,Australia,China,Germany,Spain,Turkey";
		
		StringFunc sf1 = (s) -> {						//StringFunc 인터페이스의 메서드 modify(s) 구현
			String result = "";
			char c;
			for (int i = 0; i < s.length(); i++) {
				c = s.charAt(i);
				if (c == ',')
					result += " ";						//,면 블랭크 처리
				else
					result += c;						//아니면 한글자씩 저장
			}
			return result;
		};

		String s1 = test(sf1, str);						//변수 s1이 test()메서드 호출 -> sf1은 람다식으로 정의, str은 매개변수
		System.out.println(s1);							//Line27 : return result

		String s2 = test((s) -> {						//첫번째 파라미터 StringFunc sf 가 람다식으로 되어있음
			int max = 0;
			int index = 0;
			String[] word = s.split(",");				//,로 분리해서 분리된 단어를 word라는 이름의 배열에 저장됨
			for (int i = 0; i < word.length; i++) {
				if (max < word[i].length()) {
					max = word[i].length();
					index = i;
				}
			}
			return word[index];							//word[1] = Australia
		}, str);										//두번째 파라미터 str
		System.out.println(s2);							//return word[1]
	}
}