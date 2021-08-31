package ex06.Interface;

public class MainEntry {
	public static void main(String[] args) {
		BB b=new BB();
		b.draw();
		System.out.println(b.su);
		
		iDraw i = new BB();
		i.draw();
	}
	
}
