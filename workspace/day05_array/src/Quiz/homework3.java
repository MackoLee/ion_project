package Quiz;

import java.util.Arrays;
import java.util.Collections;

public class homework3 {
	public static void main(String[] args) {
		int[] a = {7,5,7,8,2,7,3,7,7,90};
		int[] cnt=new int[100]; //수가 그렇게 크지 않을때 사용가능
		for(int temp:a) cnt[temp]++;
		int b=7;
		System.out.println(b+"의 갯수는 "+cnt[b]+"개 입니다.");
	}
}
