package ex02.operator;

//* 주석 토
public class OperatorTest {

	public static void main(String[] args) {
		//정수 (+,-,*,/,%,....) 정수 = 정수
		System.out.println(7/3);
		System.out.println(7*3);
		System.out.println(7. /3);
		
		int x = 10, y;
		//증감연산
		y=x++; //대입먼저, 증감나중 
		y=--x; //증감먼저,대입나중
		
		System.out.println(x + ", " + y);
		y=~x;
		System.out.println(x+", "+y);
		
	}
}
//*/

/*    이런식으로 하면 내가 주석처리를할 떄 하나만 지우면 전체가 주석처리 할 수 있음.
public class OperatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int result = 3 + 4* 5;
			
			System.out.println(result);
			
			
			result = (3+4)*5;
			
			System.out.println(result);
	}

}
//*/