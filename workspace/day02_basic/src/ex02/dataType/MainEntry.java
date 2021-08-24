package ex02.dataType;

public class MainEntry { //user class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Show();
//		int su =10;
//		
//		{
//			int x = 100;
//			System.out.println(x);
//		}
//		System.out.println(x);
//		System.out.println(su);
		MainEntry me = new MainEntry(); //객체 생성, 메모리 할당, 생성자함수 자동호출
		me.Show();
	}
	
	public static void Show() {
		System.out.println("run Show()");
		
	}

}
