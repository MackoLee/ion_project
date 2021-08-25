package ex01.dataType;

public class mainEntry {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 9;
		long y = 8;
	    short sh = -32768;
	    int num=-32768;
	    
	    
	    //num = sh; 묵시적 형변환 : 작은 데이터형이 큰데이터형으로 자동 변
	    sh= (short) num; // 명시적형변환 : 큰데이터형을 작은 데이터형으로 변환할때, 데이터 손실 발생
	    
	    //float f = 12.34; //에러가 난다. 왜냐하면 12.34는 double형식이기 때문이다.
	    
	   System.out.println(sh);
	    
		System.out.println("한글한글");
		System.out.println(sh);
		
		int a,b,c; //지역변수 :초기화를 하지 않은 상태에서는 사용할 수 없다.

		//System.out.println(a);// 에러가 난다 초기화가 되지 않았기 떄문
	}
}
