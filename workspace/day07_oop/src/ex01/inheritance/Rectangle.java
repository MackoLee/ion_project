package ex01.inheritance;

public class Rectangle extends Point{
	int x2,y2;

	public Rectangle(int x2, int y2) {
		super();
		this.x2 = x2;
		this.y2 = y2;
	}

	public Rectangle(int x, int y, int x2, int y2) {
		super(x, y);
		this.x2 = x2;
		this.y2 = y2;
	}
	
	public Rectangle() {
		super();
		this.x2=5;
		this.y2=5;
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
	public void  disp() {
		System.out.println("{"+super.getX() + ", "+super.getY()+"}, {"+x2+", "+y2+"}");
	}
	
}
