package quiz;

import java.util.Scanner;

public class homework3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("이상옥님의 성적표 :");
		
		String[] sub = {"국어", "영어", "전산"};
		int sum=0;
		
		for(int i=0;i<3;i++) {
			System.out.print(sub[i] + " : ");
			sum+=input.nextInt();
		}
		System.out.println("총점 : "+sum+", 평균 : "+sum/3.);
	}
}
/*문제2] 다음을 입력 받아서 출력하는 프로그램 작성
이름, 국어, 영어, 전산 점수 입력 받아서
총점, 평균 까지 출력하는

result>
이도연님의 성적표 *****
국어 : 100, 영어: 100, 전산 : 100
총점 : 300, 평균: 100.00 

*/