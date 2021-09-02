package Quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quiz2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("숫자1 입력하세요");
		String str1 = br.readLine();
		System.out.println("숫자2 입력하세요");
		String str2 = br.readLine();
		int[] answer = {new Integer(str1), new Integer(str2)};

		System.out.println("연산자를 입력하세요 : (*,/,+,-)");
		String op = br.readLine();
		switch (op.charAt(0)) {
			case '*':
				answer[0]*=answer[1];
				break;
			case '/':
				answer[0]/=answer[1];
				break;
			case '+':
				answer[0]+=answer[1];
				break;
			case '-':
				answer[0]-=answer[1];
				break;
		}
		System.out.println("결과는 "+answer[0]);
	}
}
