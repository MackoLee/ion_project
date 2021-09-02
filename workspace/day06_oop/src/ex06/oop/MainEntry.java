package ex06.oop;

//접근 지정자 : private, < default < protected < public
//private : 클래스내에서 접근가능해서 함수로만 접근가능함.
//default : 같은 패키지 내에서 접근 가능함.
//protected : 상속되어있을때 접근 가능
//public : 모두 접근 가능

class Point {
	int x,y; //멤버변수, 0 or null으로 초기화
	Point(int x, int y){ //매개변
		this.x=x; this.y=y;
	}
}


public class MainEntry {

	public static void main(String[] args) {
		
		
	}

}
