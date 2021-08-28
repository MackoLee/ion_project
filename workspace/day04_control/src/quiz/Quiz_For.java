package quiz;

import java.util.Scanner;

public class Quiz_For {
	public static void main(String[] args) {
		//1. 원하는 단을 입력 받아서 구구단 출력
		Scanner input = new Scanner(System.in);
		System.out.println("출력하고자하는 단을 입력하시오 : ");
		int a = input.nextInt();
		System.out.println(a+"단 :");
		for(int i=1;i<10;i++) {
			System.out.println(a+" * "+i +" = " + a*i);
		}

		//2. 전체 구구단 출
		for(a=1;a<10;a++) {
			System.out.println(a+"단 :");
			for(int i=1;i<10;i++) {
				System.out.println(a+" * "+i +" = " + a*i);
			}
			System.out.println();
		}
	}
}
