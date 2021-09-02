package ex04.io;

import java.io.IOException;

public class keyInput {
	public static void main(String[] args) throws IOException {
		int su1 = 0, su2 = 0;
		System.out.println("테이터 입력 끝은 Ctrl + Z 누르세요. ");
		
		while((su1 = System.in.read())!= -1) {
			if(su1==10 || su1 == 13 || su1 == 32) continue;
			System.out.print((char)su1 + "\t");
		}
		System.out.println();
	}
}
