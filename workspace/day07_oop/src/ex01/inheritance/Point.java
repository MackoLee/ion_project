package ex01.inheritance;

public class Point { // extends Object
	private int x,y;

	public Point() {
		this(0,0);
	}
	public Point(int x, int y) {
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
		System.out.print(x+", "+y);
	}
	public String toString() {
		return x+", "+y;
	}
	
}
