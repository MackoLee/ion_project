package quiz;

public class homework3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//과제 4-1
		String stars = "*****";
		for(int i=1;i<6;i++) {
			String a= stars.substring(5-i);
			System.out.println(a);
		}
		System.out.println();
		//과제 4-2
		for(int i=1;i<6;i++) {
			String a= stars.substring(i-1);
			System.out.println(a);
		}
		System.out.println();
		//과제 4-3
		stars = "    *****";
		for(int i=1;i<6;i++) {
			String a= stars.substring(i-1,i+4);
			System.out.println(a);
		}
		//과제 4-5
		stars = "    *********";
		for(int i=1;i<6;i++) {
			String a= stars.substring(i-1,i*2+3);
			System.out.println(a);
		}
	}

}
