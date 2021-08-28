package ex06.break_continue;

public class MainEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<11;i++) {
			if(i==7) break;
			System.out.println(i);
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(j);
				if(j==3) break;
			}
			System.out.println(" "+i);
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(j);
			}
			if(i==3) continue;
			System.out.println(" "+i);
		}
	}

}
