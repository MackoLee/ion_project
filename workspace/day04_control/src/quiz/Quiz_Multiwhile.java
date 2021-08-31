package quiz;

public class Quiz_Multiwhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2. 전체 구구단 출
		int i=0,j;
		while(++i<10) {
			j=0;
			if(i==1) {
				while(++j<10) System.out.print(j+"단 :     \t");
				System.out.println();
			}
			j=0;
			while(++j<10) {
				System.out.printf("%d * %d = %2d\t",j,i,i*j);
			}System.out.println();
		}
	}

}

