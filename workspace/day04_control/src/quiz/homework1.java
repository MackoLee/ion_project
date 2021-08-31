package quiz;

import java.util.Scanner;

public class homework1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] sub = {"국어", "영어", "전산"};
		char[] grade = {'F','F','F','F','F','F','D','C','B','A','A'};
		char ch = 'y'; 

		while(ch != 'n'){
			int[] score= new int[3];
			int sum=0;
			System.out.println("이름을 입력하세요 : ");
			String name = input.next();
			for(int i=0;i<3;i++) {
				do {
					try { //문자열 예외 처리
						System.out.print(sub[i] + " : (1~100)");
						score[i]=input.nextInt();
					}catch(Exception e) {
						e.printStackTrace();
					}
				}while(score[i]<0 || score[i]>100);
				
				sum+=score[i];
			}

			System.out.println(name+"님의 성적표 :*******");
			for(int i=0;i<3;i++) {
				System.out.print("국어 : "+score[i] +" ");
			}
			System.out.println("총점 : "+sum+", 평균 : "+sum/3. + ", 학점 : "+ grade[sum/30]);
	
			String str;
			do {
				System.out.println("계속 하시겠습니까? (y/n)");
				str = input.next();
			}while(str.length()==1 && str.charAt(0)!='y' && str.charAt(0)!='n'); // y/ n 입력 예외 처리
			
			ch = str.charAt(0);
		}
	}
}
