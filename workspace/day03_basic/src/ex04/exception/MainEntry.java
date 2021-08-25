package ex04.exception;

import java.util.Scanner;

public class MainEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("x, y integer data input : ");
		int x,y;
		x = new Scanner(System.in).nextInt();
		y = new Scanner(System.in).nextInt();
		
		try {
			int result = x/y;
			System.out.println(x+"/"+ y +"=" + result);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} //catch( ArithmeticException Error) { //하위 클래스를 위에 오게 해야함. 아니면 에러가 난다.
			
		//}
		
	}

}
/*
import java.util.Scanner;

public class MainEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("x, y integer data input : ");
		int x,y;
		x = new Scanner(System.in).nextInt();
		y = new Scanner(System.in).nextInt();
		
		try {
			int result = x/y;
			System.out.println(x+"/"+ y +"=" + result);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
//*/