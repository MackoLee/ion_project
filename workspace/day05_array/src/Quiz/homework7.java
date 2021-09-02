package Quiz;

import java.util.Scanner;

public class homework7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("두개의 정수를 입력해주세요 : ");
		int a=input.nextInt(), b=input.nextInt();
		System.out.println("두개 수중 큰수는 "+max(a,b)+" 입니다.");
	}
	public static int max(int a, int b) {
		return (a>b?a:b);
	}
}
