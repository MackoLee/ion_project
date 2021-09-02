package Quiz;

import java.util.Scanner;

public class Quiz_array {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] sub = {"국어", "영어", "전산"};
		char[] grade = {'F','F','F','F','F','F','D','C','B','A','A'};

		String[] name=new String[7];
		int[][] score= new int[7][3];
		int [] sum = {0,};
		for(int n=0;n<7;n++) {
			System.out.println("이름을 입력하세요 : ");
			name[n] = input.next();
			for(int i=0;i<score[n].length;i++) {
				do {
					try { //문자열 예외 처리
						System.out.print(sub[i] + " : (1~100)");
						score[n][i]=input.nextInt();
					}catch(Exception e) {
						e.printStackTrace();
					}
				}while(score[n][i]<0 || score[n][i]>100);
				
				sum[n]+=score[n][i];
			}

			
		}
		for(int n=0;n<7;n++) {
			System.out.println(name[n]+"님의 성적표 :*******");
			for(int i=0;i<sub.length;i++) {
				System.out.print(sub[i]+" : "+score[n][i] +" ");
			}
			System.out.println("총점 : "+sum[n]+", 평균 : "+(double)sum[n]/sub.length + ", 학점 : "+ grade[sum[n]/(sub.length*10)]);
		}
	}

}
