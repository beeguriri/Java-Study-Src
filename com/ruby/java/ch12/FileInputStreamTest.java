package com.ruby.java.ch12;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.Reader;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileInputStreamTest {

	private static boolean bPrint = false;
	
	public static long test01() {
		
		long start = System.currentTimeMillis();					//currentTimeMillis()의 return type : long
		try (InputStream is = new FileInputStream("test.dat");) {	//워크스페이스가 있는 폴더를 찾음
																	//특정 폴더의 파일 쓰려면 C:/java/test.dat
			int ch;
			while(0 <= (ch = is.read())) {		//1byte씩 읽을 값이 있으면 루프반복
				if (bPrint)						//true면 console창에 출력
					System.out.println(ch);
			}		
			return System.currentTimeMillis() - start;		//걸린시간 리턴값으로 반환
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return -1L;				// try에서 에러 발생해서 catch로 빠지면 -1이 리턴(비정상처리를 의미)
								// type이 long이라서 L이 붙음 (int라면 -1만 해주면 됨)
	}

	public static long test02() {
	
		byte[] buffer = new byte[1024];

		long start = System.currentTimeMillis();
		try (InputStream is = new FileInputStream("test.dat");) {
			while(0 <= is.read(buffer)) {
				if (bPrint)
					System.out.println(new String(buffer));
			}
			return System.currentTimeMillis() - start;
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return -1L;
	}

	public static long test03() {		//bufferedInputStream사용하기
		
		byte[] buffer = new byte[1024];

		long start = System.currentTimeMillis();
		
		//InputStream > FileInputStream 상속관계
		try (InputStream bis = new BufferedInputStream(new FileInputStream("test.dat"));) {
			while(0 <= bis.read(buffer)) {
				if (bPrint)
					System.out.println(new String(buffer));
			}
			return System.currentTimeMillis() - start;
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return -1L;
	}

	public static long test04() {
		
		long start = System.currentTimeMillis();
		try (Reader fr = new FileReader("test.dat");) {
			int ch;
			while(0 <= (ch = fr.read())) {
				if (bPrint)
					System.out.println(ch);
			}
			return System.currentTimeMillis() - start;
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return -1L;
	}
	
	public static long test05() {
		
		char[] buffer = new char[1024];

		long start = System.currentTimeMillis();
		try (Reader fr = new FileReader("test.dat");) {
			while(0 <= fr.read(buffer)) {
				if (bPrint)
					System.out.println(buffer.toString());
			}
			return System.currentTimeMillis() - start;
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return -1L;
	}	
	
	public static long test06() {
		
		char[] buffer = new char[1024];

		long start = System.currentTimeMillis();
		try (Reader br = new BufferedReader(new FileReader("test.dat"));) {
			while(0 <= br.read(buffer)) {
				if (bPrint)
					System.out.println(buffer.toString());
			}
			return System.currentTimeMillis() - start;
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return -1L;
	}		
	
	public static long test07() {

		ByteBuffer buffer = ByteBuffer.allocate(1024);
		
		long start = System.currentTimeMillis();
		try (RandomAccessFile raf = new RandomAccessFile("test.dat", "r");
				FileChannel channel = raf.getChannel();) {
			int len;
			while((len = channel.read(buffer)) > 0) {
				if (bPrint)
					System.out.println("-->" + len + ":" + new String(buffer.array(), 0, len, "UTF-8"));
				buffer.clear();
			}
			return System.currentTimeMillis() - start;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return -1L;
	}
	
	public static void main(String[] args) {

		System.out.println("-->test01");
		long t1 = test01();						// 1byte씩 읽어서 출력, t1에 걸린시간 리턴값으로 반환됨
		System.out.println("-->test02");
		long t2 = test02();						// 1024byte 버퍼를 생성해서 출력
		System.out.println("-->test03");
		long t3 = test03();						// ** buffered input stream 8kb(1024*8byte) 읽어서 출력 **
		System.out.println("-->test04");
		long t4 = test04();						
		System.out.println("-->test05");
		long t5 = test05();						
		System.out.println("-->test06");
		long t6 = test06();						
		System.out.println("-->test07");
		long t7 = test07();

		System.out.printf("test01():FileInputStream:1byte :%dms\n", t1);
		System.out.printf("test02():FileInputStream:buffer:%dms\n", t2);
		System.out.printf("test03():BufferedInputStream   :%dms\n", t3);
		System.out.printf("test04():FileReader:1byte      :%dms\n", t4);
		System.out.printf("test05():FileReader:buffer     :%dms\n", t5);
		System.out.printf("test06():BuffredReader         :%dms\n", t6);
		System.out.printf("test07():FileChannel           :%dms\n", t7);

		System.out.println("Done");
	}
}
