package ex02.array;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		//1.
		int[][] a = new int[2][3]; // 행크기, 열크기
		//2.
		int[][] a2 = {{1,2,3},{4,5,6}};
		
		// 2차원 배열에 임의의 데이터 입력 받아서 값 출력하고 행끼리 더한 결과 출력;
		int[][] b = new int[2][3];
		int[] sum = {0,0};
		
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				System.out.println((i+1)+"행"+(j+1)+"열 을 입력해주세요");
				b[i][j]= input.nextInt();
			}
		}

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				System.out.println(i+"행"+j+"열 : " + b[i][j]);
				sum[i]+=b[i][j];
			}	
		}
		
		for(int i=0;i<sum.length;i++) {
			System.out.println(i+ "행의 합은 "+sum[i]+"입니다.");
		}
	}

}
