package ex01.inheritance;

public class Circle extends Point {
	private int r;

	public Circle(int x, int y, int r) {
		super(x, y);
		this.r = r;
	}
	public Circle(int r) {
		this.r=r;
	}
	public Circle() {
		this.r=5;
	}
	public Circle(int x, int y) {
		super(x, y);
		r=10;
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	@Override
	public String toString() {
		return "Circle [r=" + r + ", getX()=" + getX() + ", getY()=" + getY() + "]";
	}
	
	
}
