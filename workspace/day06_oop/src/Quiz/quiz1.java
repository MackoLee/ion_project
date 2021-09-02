package Quiz;

import java.util.Random;
import java.util.Scanner;

public class quiz1 {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		int r_num=(int) random.nextInt(101);
		
		for(int i=5;i>0;i--) {
			System.out.println("기회가 "+i+"회 남았습니다. 예측되는 숫자를 입력하세요.");
			int num = input.nextInt();
			if(r_num == num) {
				System.out.println("정답입니다.");
				break;
			}
			System.out.println(num+ "보다 " + (r_num>num?"큽니디.":"작습니다."));
		}
		System.out.println("정답은 "+r_num+"입니다.");
	}
}
