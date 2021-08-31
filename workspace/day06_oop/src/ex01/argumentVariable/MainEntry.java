package ex01.argumentVariable;

//가변길
public class MainEntry {
	public static void main(String[] args) {
		plus(1,2);
		plus(3);
		plus(10,22,3,4,5,6,7,9);
	}
	private static int plus(int...x) {
		int sum=0;
		for(int i:x) {
			sum+=i;
		}
		return sum;
	}
}
