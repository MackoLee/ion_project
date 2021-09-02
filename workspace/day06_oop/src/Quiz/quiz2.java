package Quiz;

import java.util.Arrays;
import java.util.Random;

public class quiz2 {
	public static void main(String[] args) {
		Random r_num = new Random();
		int[] a=new int[6];
		for(int i=0;i<6;i++) {
			a[i]=(int) r_num.nextInt(45)+1;
			for(int j=0;j<i;j++) {
				//중복 확인.
				if(a[i]==a[j]) {
					i--;
					break;
				}
			}
		}
		
		Arrays.sort(a);
		System.out.println("이번주 로또 번호는 ");
		for(int i : a) System.out.print(i+" ");
		System.out.println("입니다.");
	}
}
