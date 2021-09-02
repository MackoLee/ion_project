package ex05.utilPackage;

import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

public class MainEntry {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		System.out.print(c.get(c.YEAR)+"년");
		System.out.print(c.get(c.MONTH)+1+"월"); //월은 0부터 시작함.
		System.out.println(c.get(c.DATE)+"일");
		
		System.out.println("======================");
		Date date = new Date();
		int h = date.getHours();
		int m = date.getMinutes();
		int s = date.getSeconds();
		System.out.println("현재 시간은 " + h +":"+m+":"+s);
		
		StringTokenizer st = new StringTokenizer("this is a test");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		StringTokenizer st2 = new StringTokenizer("박정희/전두환/노태우/김영삼","/");
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
	}
}
