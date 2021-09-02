package ex04.io;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainEntry{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				            new InputStreamReader(System.in));
		
		System.out.println("charator input =");
		String str = br.readLine();
		int su1 = new Integer(str);
		
		System.out.println(su1+100);
		//System.out.println(str);
	}
}

/*
public class MainEntry {
	public static void main(String[] args) {
		InputStream is = System.in; // 표준입력
		
		System.out.print("단일 문자 입력 요망 : ");
		try {
			//char num = (char)is.read(); //예외발생함. '0'~'9' : 48~57 (ASCII code)
			int num = is.read()-48;
			System.out.println(num);
			is.read();is.read(); //엔터쳤을때 입력 대기 안하는거 처리. 자바에서 '문자' 2byte 처리
			
			int num2 = is.read()-48;
			System.out.println(num2-num);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
**/
