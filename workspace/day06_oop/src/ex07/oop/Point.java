package ex07.oop;

public class Point {
	private int x,y;

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
		System.out.println(x + ", " + y);
	}
	
	
}
