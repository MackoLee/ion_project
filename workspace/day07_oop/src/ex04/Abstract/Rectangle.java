package ex04.Abstract;

//사각형 클래스 구현하기
class Rectangle extends Shape{
	double y;

	@Override
	public double calc(double x) {
		result =x*y;
		return result;
	}

	@Override
	public void show(String name) {
		calc(9.0);
		System.out.println(result + " 크기의" + name + "이 그려졌습니다.");
	}

	
}