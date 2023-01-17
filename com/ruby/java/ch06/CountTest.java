package com.ruby.java.ch06;

class Count {
	public static int totalCount; //totalCount = 0;
	int count;					  //count=0;
}

public class CountTest {		//public은 하나만 사용 (메인이 있는 곳)
	public static void main(String[] args) {
		Count c1 = new Count();
		Count c2 = new Count();
		Count c3 = new Count();
		
		c1.count++;				//참조변수 c1이 count 호출(count=0;) -> 1 저장
		Count.totalCount++;		//Count 클래스의 스태틱변수 totalCount(totalCount=0;) 호출 -> 1저장
		System.out.println(Count.totalCount + " : " + c1.count);
		
		c2.count++;				//참조변수 c2가 count 호출(count=0;) -> 1 저장
		Count.totalCount++;		//Count 클래스의 스태틱변수 totalCount(totalCount=1;) 호출 -> 2저장
		System.out.println(Count.totalCount + " : " + c2.count);
		
		c3.count++;				//참조변수 c3가 count 호출(count=0;) -> 1 저장
		Count.totalCount++;		//Count 클래스의 스태틱변수 totalCount(totalCount=2;) 호출 -> 3저장
		System.out.println(Count.totalCount + " : " + c3.count);
		
		System.out.println("---------");

			//Count 클래스의 스태틱변수 totalCount(totalCount=3;) 저장되어있으므로 3 출력
			//참조변수 c1, c2, c3에는 각각 1 저장
		
		System.out.println(Count.totalCount + " : " + c1.count);
		System.out.println(Count.totalCount + " : " + c2.count);
		System.out.println(Count.totalCount + " : " + c3.count);

	}

}
