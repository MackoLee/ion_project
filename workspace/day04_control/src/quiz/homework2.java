package quiz;

public class homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//과제 1
		int answer=0;
		for(int i=1;i<6;i++) {
			for(int j=1; j<=i ; j++) {
				answer+=j;
				System.out.println(answer);
			}
		}
		System.out.println("과제 1] 1 + (1 + 2) + (1 + 2 + 3) + (1 + 2 + 3 + 4) + (1 + 2 + 3 + 4 + 5) " + answer);
		//과제2
		answer=0;
		int mul=-1;
		for(int i=1;i<11;i++) {
			answer+=i*(i%2==0?1:-1);
		}
		System.out.println("과제 2]  (-1) + 2 + (-3) + 4 + (-5) + ... + (-9) + 10 = ?" + answer);
		
		//과제3
		double answer2=0;
		for(int i=1;i<10;i++) {
			answer2+=(double) i/(i+1);
		}
		System.out.println("과제 3] 1/2 + 2/3 + 3/4 + 4/5 + 5/6 + 6/7 + 7/8 + 9/10 = ?" + answer2);
	}

}
