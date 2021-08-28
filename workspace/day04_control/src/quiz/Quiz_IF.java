package quiz;

import java.util.Scanner;

/*
    전산, 영어, 국어 입력 받아서 평균 60점 이상
    각 과목 과락 40 이하이면 과목 불합
 */
public class Quiz_IF {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String[] sub= {"전산", "영어", "국어"};
		int[] score = new int[3];
		int sum =0;
		for(int i=0;i<3;i++) {
			System.out.println(sub[i]+" 점수를 입력하세요 : ");
			score[i] = input.nextInt();
			sum += score[i];
		}
		Boolean visit=false;
		for(int i=0;i<3;i++) {
			if(score[i]<40) {
				System.out.println(sub[i]+"과목이 40점 이하라서 과락입니다.");
				visit=true;
			}
		}
		if(!visit) {
			if(sum < 180) System.out.println("과목평균 : " + sum/3. + "으로 60점이하라서 과락입니다.");
			else System.out.println("합격입니다.");
		}
		
	}

}
