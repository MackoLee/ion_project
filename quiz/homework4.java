package quiz;

import java.util.Scanner;

public class homework4 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("이름 : ");
		String name = input.next();
		System.out.println("나이 : ");
		int age = input.nextInt();
		System.out.println("키와 몸무게: ");
		double tall=input.nextDouble(), weight=input.nextDouble();
		System.out.println("이름은 "+name+"입니다.");
		System.out.println("나이는 "+age+"살 입니다.");
		System.out.println("키는 "+tall+"이고, 몸무게는 "+ weight + "입니다.");
		
	}
}
/*
문제3] 자료형에 맞춰서 선언하고 값 출력하는 프로그램 작성
이름 String 
나이 int
키 또는 몸무게 실수형

*/