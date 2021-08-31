package ex08.inheritance;

class Point {
	private int x, y;

	public Point() {
		x = y = 10;
	}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void disp() {
		System.out.print("x= " + x + ", y= " + y);
	}
}// Point end

class Circle extends Point { // 상속 - extends
	private int r;

	public Circle() {
		super();
		super.setX(1);;
		this.r=10;
	}
	public Circle(int x, int y) {
		super(x, y);
		this.r=r;
	}
	
	public Circle(int r) {
		super();
		this.r = r;
	}
	
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public void disp() {
		System.out.println("x= " + super.getX() + ", y= " + super.getY()+", r= " + r);
	}
	
}
//사각형 클래스 만들기 - Point 상속 관계 만들
class Reactagle extends Point{
	int x2, y2;

	public Reactagle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reactagle(int x, int y, int x2, int y2) {
		super(x,y);
		this.x2 = x2;
		this.y2 = y2;
	}

	public int getX2() {
		return x2;
	}

	public int getY2() {
		return y2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}
	
	public void disp() {
		super.disp();
		System.out.println("x2 = " +x2 + ", y2 = "+y2);
	}
}

public class MainEntry {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.disp();
	}
}
