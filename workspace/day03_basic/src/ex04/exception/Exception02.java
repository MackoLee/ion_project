package ex04.exception;

import java.util.Scanner;

public class Exception02{
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.out.print("x, y integer data input : ");
		int x,y;
		x = new Scanner(System.in).nextInt();
		y = new Scanner(System.in).nextInt();
		
		int result = x/y;
		System.out.println(x+"/"+ y +"=" + result);
	}
}
