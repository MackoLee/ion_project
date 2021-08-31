package quiz;

public class Quiz_Control {
	/*
	  문제] 1~100중에서 3의 배수의 개수와 합을 구하세요.
	 */
	public static void main(String[] args) {
		//for(int i=3;i<=100;i+=3) {
		//}
		int cnt=0,sum=0;
		for(int i=1;i<101;i++) {
			if(i%3==0) {
				cnt++;
				sum+=i;
			}
		}
		System.out.println("1부터 100까지 중 3의 배수의 갯수는 "+cnt+"개 입니다. 합은 " +sum+"입니다.");
	}

}
