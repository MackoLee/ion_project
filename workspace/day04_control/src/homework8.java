import java.util.Scanner;

public class homework8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true){
			try {
				Scanner input = new Scanner(System.in);
				System.out.println("a / b 를 구하기 위해서 두개의 정수를 입력하시오 : (단, b!=0) ");
				int a=input.nextInt(), b=input.nextInt();
				int k = 1/b;
			 	System.out.printf("a/b = %.2f \n",(double) a/ b);
			 	break;
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
