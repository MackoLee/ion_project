package Quiz;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class homework1 {
	public static void main(String[] args) {
		Customers customers = new Customers();
		Scanner input = new Scanner(System.in);
		
		end :
		while(true) {
			int cmd;
			System.out.print("명령어를 입력하세요. (고객추가 : 1 , 고객삭제 : 2 , 고객리스트 출력 : 3 , 고객수정 : 4 , 프로그램종료 : 0 )");
			try {
				cmd= new Integer(input.next());
				if(cmd >4 || cmd<0) throw new IndexOutOfBoundsException();
				
				switch (cmd) {
					case 1: //고객 추가
						System.out.println(customers.add()?"성공": "실패"); 
						break;
					case 2: //고객 삭제
						System.out.println(customers);
						System.out.println(customers.remove()?"성공": "실패");
						System.out.println(customers);
						break;
					case 3: //고객 리스트 출력
						System.out.println(customers);
						break;
					case 4: //수정
						System.out.println(customers);
						System.out.println(customers.edit()?"성공": "실패");
						System.out.println(customers);
						break;
					default: //반복문 종료
						break end;
				}
			}
			catch(Exception e) {
				//e.printStackTrace();
				System.out.println("입력 문자가 잘못되었습니다. 처음부터 입력해주세요.");
				continue;
			}
			
		}
		
	}
}
