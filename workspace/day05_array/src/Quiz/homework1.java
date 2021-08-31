package Quiz;

import java.util.Arrays;

public class homework1 {
	public static void main(String[] args) {
		int[] a = {7,5,3,8,2};
		for(int i=1;i<a.length;i++) {
			a[0]+=a[i];
		}
		System.out.println("배열의 합은 "+a[0]+"입니다.");
	}
}
