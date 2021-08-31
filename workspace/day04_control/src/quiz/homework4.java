package quiz;

public class homework4 {
	public static void main(String[] args) {
		//과제 4
		for(int i=1;i<11;i++) {
			System.out.println(i);
		}
		//과제 5
		int i=0,sum=0;
		while(i++<100) {
			sum+=i;
			System.out.println(i);
		}
		System.out.println(sum);
		
		
		int cnt=1;
		//과제 6
		for(i=1;i<101;i++) {
			if(i%2 == 0) {
				System.out.print(i+ " ");
				if(cnt++%10 == 0) System.out.println();
			}
		}
	}
}
