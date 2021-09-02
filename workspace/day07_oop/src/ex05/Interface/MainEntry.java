package ex05.Interface;

interface A{ // interface - abstract method, final field 만 갖는다.
	int x = 99; // static final 이 생략이 됨.
	final int y = 777;
	
	//추상메소드, abstract 생략가능함 - 무조건 추상메소드임.
	public void show(); // public abstract void show()
}

interface B{
	void bView();
}

interface C{
	String name = "happy";
	public void cDraw();
}

//interface 간에 상속할 때는 extends 키워드를 사용한다.
interface D extends B{
	void dShow();
}

class Rect implements D{

	@Override
	public void bView() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dShow() {
		// TODO Auto-generated method stub
		
	}
	
}
class Shape{
	
}

class Multi extends Shape implements A,B,C{ //클래스가 먼저 받아져야한다. implements 를 쓰면 에러가 난다.

	@Override
	public void cDraw() {
		// TODO Auto-generated method stub
		System.out.println("have C");
	}

	@Override
	public void bView() {
		
		// TODO Auto-generated method stub
		System.out.println("have B");
	}

	@Override
	public void show() {
		System.out.println("have A");
	}
	
}

public class MainEntry {
	public static void main(String[] args) {
		B b = new Multi();
		b.bView();
		A a = new Multi();
		a.show();
		Multi m = new Multi();
		m.cDraw(); m.show();
	}
}
