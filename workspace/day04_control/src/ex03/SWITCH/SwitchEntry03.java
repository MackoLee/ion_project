package ex03.SWITCH;

import java.util.Scanner;

public class SwitchEntry03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner input = new Scanner(System.in);
				System.out.println("1, 2, 3 중에서 하나를 선택하시오 : ");
				int point= input.nextInt();
				
				switch (point) {
					case 1:
						System.out.println(" 집 ");
						break;
					case 2:
						System.out.println("피아");
						break;
					case 3:
							
						break;
					default:
						break;
				}
				
				
	}

}
