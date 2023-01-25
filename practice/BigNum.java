package practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;




public class BigNum {

	
	//입력받은 숫자를 string으로 return하고자 함
	//한줄씩  읽어들이도록
	public static ArrayList <String> inputNum() {
		
		ArrayList <String> arr = new ArrayList <> ();
		
		try (BufferedReader br = new BufferedReader(new FileReader("input.txt"));) {
			String str;
			while((str = br.readLine()) != null) {
				System.out.println("입력 된 숫자 : " + str);
				
				//arr 배열에 string 추가하기!
				arr.add(str);
			}		
			return arr;
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String[] args) {

		
		/*
		//저장 된 배열 받아옴
		ArrayList <String> arr = inputNum();
		//arr[0] 에 첫번째줄 숫자 저장
		//arr[1] 에 두번째줄 숫자 저장되어있음
		
		System.out.println(arr);

		//저장 된 배열을 list로 변환
		Object num[] = arr.toArray();
		
		System.out.println("num[0] : " + num[0]);
		System.out.println("num[1] : " + num[1]);
		
		for (Object s : num) {
//            num.add(Integer.parseInt(s));
        }
		
		*/
		
		
				
	}

}
