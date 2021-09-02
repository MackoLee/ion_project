package ex04.io;
import java.io.*;

public class MainEntry {
	public static void main(String[] args) {
		InputStream is = System.in;// 표준 입력
		
		
		try {
			System.out.print("단일 문자 입력 요망 : ");
			int num = is.read()-48; //예외발생함. '0'~'9' : 48 ~ 57 (ASCII code)
			
			is.read();			is.read(); // 문제 발생처리 - 자바에서 '문자' 2바이트 처리됨
			
			int num2 = is.read()-48; 
			
			//System.out.println((char)num);
			System.out.println(num + num2);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
