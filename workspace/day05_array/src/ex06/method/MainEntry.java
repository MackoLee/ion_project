package ex06.method;

public class MainEntry {
	public static void main(String[] args) {
		line(1);
		System.out.println(getzero());
		System.out.println(plus(10,30));
	}
	
	//매개 X, 리턴 X
	public static void line() {
		System.out.println("--------------------------------------------");
	}
	//매개 O, 리턴 X
	public static void line(int a) {
		System.out.println("--------------------------------------------".substring(0,a));
	}
	public static int getzero() {
		return 0;
	}
	public static int plus(int a, int b) {
		return a+b;
	}
	
}
