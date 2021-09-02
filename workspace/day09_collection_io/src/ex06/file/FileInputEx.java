package ex06.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class FileInputEx {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		File f = new File("memo.txt");
		OutputStream os = new FileOutputStream(f,true); //true 하면 이어쓰기 가능
		while(true) {
			System.out.println("문자열 입력 요망 : ");
			String str = sc.nextLine() + "\r\n";
			
			if(str.toUpperCase().equals("EXIT\r\n")) break;

			os.write(str.getBytes()); // 읽어들인 문자 입력
			
		}
		System.out.println("memo.txt save success!!!");
	}
}
