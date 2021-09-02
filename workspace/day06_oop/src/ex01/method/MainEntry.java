package ex01.method;

public class MainEntry {
	public static void line(int n, char c) {
		for(int i=0;i<n;i++) {
			System.out.println(c);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		line();
		line('*');
		line(20,'*');
	}

	private static void line(char c) {
		for(int i=0;i<10;i++) {
			System.out.println(c);
		}
		System.out.println();
	}
	private static void line() {
		System.out.println("====================");
	}
	
}