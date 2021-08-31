package ex06.break_continue;

import java.util.Scanner;

public class WhileCharSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		char ch =' ';
		String str = null;
		int count = 0;
		
		System.out.println("아무 값이나 입력 하세요. '!' 을 누르면 탈출 : ");
		int su = 10;
		while(true) {
			str=input.next();
			ch=str.charAt(0);
			
			if(ch == '!') break;
			
			count++;
		}//while end
		
		System.out.println("총 입력 받은 문자 갯수는 : " + count + "개.");
	}

}
