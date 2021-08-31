package Quiz;

import java.util.Scanner;

public class homework6 {
	public static void main(String[] args) {
		System.out.println("숫자를 입력해주세요 : ");
		Scanner input = new Scanner(System.in);
		int a= input.nextInt();
		System.out.println(a+"의 절댓값은 "+abs(a)+"입니다.");
	}
	public static int abs(int x) {
		return (x>0?x:-x);
	}
}
