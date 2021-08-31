package quiz;

import java.util.Scanner;

public class Quiz_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		// 사칙연산 프로그램 작성 - 연산자 1개, 정수숫자 2개
		System.out.println("연산자를 입력해주세요 : ");
		char op = input.next().charAt(0);
		System.out.println("숫자 두개를 입력해주세요 : ");
		int a=input.nextInt(), b=input.nextInt();
		System.out.print(a+ " " + op+ " " + b + " = ");
		switch (op) {
			case '*': a*=b; break;
			case '+': a+=b; break;
			case '-': a-=b; break;
			case '/': a/=b; break;
			default:
				System.out.println("입력이 잘못되었습니다.");
				break;
			}
		System.out.println(a+"입니다.");
	}

}
