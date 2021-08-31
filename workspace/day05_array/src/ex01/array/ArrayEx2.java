package ex01.array;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
//		int[] a = new int[5];
//		a[0]=1;
//		a[1]=2;
//		a[2]=3;
//		a[3]=4;
//		a[4]=5;
		int[] a = {1,2,3,4,5};
		//System.out.println(a[0]);
		for(int c:a) {
			System.out.println(c);
		}
		
		int[] arr = new int[9];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=i;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
			if((i+1)%5 == 0) System.out.println();
		}
		//임의의 배열에 데이터 입력 받아서 입력 된 데이터 출력 및 합 구하는 프로그램 작성
		Scanner input = new Scanner(System.in);
		int[] b = new int[5];
		int sum=0;
		for (int i = 0; i < b.length; i++) {
			System.out.println((i+1)+"번째 인덱스를 입력해주세요.");
			b[i]=input.nextInt();
			sum+=b[i];
		}
		for(int i=0;i<b.length;i++) {
			System.out.println((i+1)+"번째 데이터"+b[i]);
		}
		System.out.println(sum);
		
	}

}
