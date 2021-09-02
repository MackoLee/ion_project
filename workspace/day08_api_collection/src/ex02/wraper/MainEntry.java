package ex02.wraper;

class Point{}
public class MainEntry {
	public static void main(String[] args) {
		Integer iA = new Integer(10);
		Integer iB = new Integer("10");
		String su = "30";
		String su2= su;
		Point pt = new Point();
		su+='1';
		System.out.println(iA.MAX_VALUE);
		System.out.println(iA.MIN_VALUE);
		
		System.out.println(pt);
		System.out.println(iA.hashCode());
		System.out.println(iA.getClass().getName()+'@'+Integer.toHexString(iA.hashCode()));
		
		//Boxing vs UnBoxing
		int c= iA.intValue(); // jdk 4.x 이전에 사용하던 메소드
		int d = iB; //jdk 5.x 이후부터 autoboxing, unboxing
		int num = new Integer("11111111");
		int f = Integer.parseInt("111111111", 2);
		System.out.println(f);
		
		System.out.println(su2.compareTo(su));
		System.out.printf("%d %o %x %X\n", 10, 10, 10,10);
		System.out.printf("%d %d %d\n",012,0xA, 0x12 );// 0숫자 - 8진수 , 0x숫자 - 16진수
	}
}
