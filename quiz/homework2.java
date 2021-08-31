package quiz;

import java.util.Scanner;

public class homework2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("연산자를 입력해주세요 : ");
		String op=input.next();
		System.out.println("숫자 두개를 입력해주세요 :");
		int a= input.nextInt(), b= input.nextInt();
		System.out.println(a + op + b + "=" + operation(op,a,b));
	}

	public static int operation(String op, int a, int b){
		try {
			if(op.equals("*")) return a*b;
			if(op.equals("/")) return a/b;
			if(op.equals("+")) return a+b;
			if(op.equals("-")) return a-b;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
		return 0;
	}
}
/*
과제2] 연산자(+, -, *, /)와 정수 2개 입력 받아 사칙연산 프로그램 작성

> 입력받기 - Scanner class  jdk 5.0
   java.io <--- Input  / Output

   nextXXX()
        자료형
   nextInt()
   nextFloat()
   nextDouble()
   next() vs nextLine()  <--- String input method
*/
