package ex04.Abstract;

public class MainEntry {
	public static void main(String[] args) {
		// 1. 각자의 클래스로 객체 생성 형태
		
		Rectangle r = new Rectangle();
		r.show("Rectangle");
		
		Triangle t = new Triangle();
		t.show("삼각형");
		
		//2. Shape 부모 추상 클래스를 이용하여 객체 생성.
		Shape sh = new Rectangle();
		sh.show("cir");
	}
}
