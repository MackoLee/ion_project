package ex05.io;

import java.io.*;


public class MainEntry {
	public static void main(String[] args) 
			throws IOException {
		
//		InputStream is = System.in;
//		Reader reader = new InputStreamReader(is);
//		BufferedReader br = new BufferedReader(reader);
		
		BufferedReader br = new BufferedReader(
									new InputStreamReader(System.in));
		
		
		System.out.println("charator input =");
//		String str = br.readLine();  // 예외발생. 여러개 데이터 입력 받기
		int su1 = Integer.parseInt(br.readLine());
		int su2 = Integer.parseInt(br.readLine());
		
//		System.out.println(str + 100);
		System.out.println(su1 + su2);
	}
}








