package ex03.generic;

public class MainEntry {
	public static void main(String[] args) {
		GenericEx<String> t1 = new GenericEx<String>();
		String[] str = {"abc", "kbs", "dirotor" };
		
		t1.set(str);		t1.print();
		System.out.println();
		
		GenericEx<Integer> t2 = new GenericEx<Integer>();
		Integer[] num = {1,2,3,4,5};
		t2.set(num); 		t2.print();
		System.out.println();
		
		
	}
}
