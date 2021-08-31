package Quiz;

public class homework2 {
	public static void main(String[] args) {
		double rain[]= {0, 33.3, 29.8, 0 , 0, 6.4,61.0, 0, 1.3, 3.9, 1.2, 5.7, 0, 0.0, 0, 0.3, 0, 0, 0.3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 38.3};
		for(int i=1;i<rain.length;i++) {
			rain[0]+=rain[i];
		}
		System.out.printf("9월 강수량 평균은 %.2f(ml) 입니다.", rain[0]/rain.length);
	}
}
