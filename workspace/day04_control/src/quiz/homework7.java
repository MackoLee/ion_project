package quiz;

import java.util.Scanner;

public class homework7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		String str;
		char ch=' ';
		do {
			System.out.println("알파벳 하나를 입력하세요 : ");
			str = input.next();
			
			if(str.length()!=1) continue; // 길이가 1보다 크거나 작으면 캐릭터형이 아니다.
			
			ch = str.charAt(0);
			
			switch(ch) {
				case 'a': case 'b': case 'c':case 'd':case 'e':case 'f':case 'g':case 'h':case 'i':case 'j':case 'k':case 'l':case 'm':case 'n':case 'o':case 'p':case 'q':case 'r':case 's':case 't':case 'u':case 'v':case 'w':case 'x':case 'y':case 'z':
					ch-=32;break;
				case 'A': case 'B': case 'C':case 'D':case 'E':case 'F':case 'G':case 'H':case 'I':case 'J':case 'K':case 'L':case 'M':case 'N':case 'O':case 'P':case 'Q':case 'R':case 'S':case 'T':case 'U':case 'V':case 'W':case 'X':case 'Y':case 'Z':
					ch+=32;break;
				default:
					ch='0';
			}
		}while(ch=='0');
		
		System.out.println(""+ch);
	}
}
