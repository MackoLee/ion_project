package ex01.scanner;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("string input : ");
		String str = input.next();
		
		System.out.println("next() is :" + str);

	}

}
