package Quiz.homework2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		Employ employs[] = {
				new Employ("이상옥","01025272927","미정", "신입"),
				new Regular("유부장","01011111111","ICE","부장",10000),
				new Sales("김판매","01012345678","마케팅","대리",4000,0.2),
				new PartTime("박알바","01033333333","마케팅","매니저",5, 20)
		};
		
		for(Employ employ : employs)
			System.out.println(employ);
		
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		Scanner input = new Scanner(System.in);
		
		System.out.print("직원을 추가 하시겠습니까? (y,n)");
		String cmd="y";
		

		while(cmd=="y") {
			cmd = input.nextLine();
			
			
			
			
		}
		
		
	}
}
