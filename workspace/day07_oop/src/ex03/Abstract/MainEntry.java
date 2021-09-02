package ex03.Abstract;

abstract class Shape{ // 추상 클래스, Super class
	double result =0;
	public abstract double calc(); // 추상 메소드
	public abstract void draw();
	
	public void show() { // 일반 메소드
		System.out.println("Super class Shape");
	}
}

class Triangle extends Shape{
	double z=5.0;
	@Override
	public double calc() {
		return 0;
	}

	@Override
	public void draw() {
		
	}
	
}
// 사각형 클래스 구현하기
class Rectangle extends Shape{
	double x,y;

	@Override
	public double calc() {
		result =x*y;
		return result;
	}

	@Override
	public void draw() {
		System.out.println("넓이가 "+result+"인 사각형을 그렸습니다.");
	}
	
}
public class MainEntry {
	public static void main(String[] args) {
		
	}
}
//ctrl d 한줄지우기
//ctrl sp 자동완성
//ctrl shift f