package ex03.method;

class A{
	int x,y;
	public static void setData(int xx, int yy) {
		System.out.println(xx+", "+yy);
	}
}

public class StaticMethod {
	public static void main(String[] args) {
		A.setData(1, 2); //static 이라서 메모리 할당을 하지않아도 된다.
		//그렇기 때문에 클래스 내의 변수를 활용하는게 안된다.
		A a = new A(); // 객체생성, 메모리에 할당, 생성자함수 자동호출
		a.setData(1, 2);
	}
}
