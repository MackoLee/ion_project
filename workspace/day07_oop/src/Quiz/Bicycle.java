package Quiz;

public class Bicycle implements Trans {

	@Override
	public void start() {
		System.out.println("자전거 패달을 돌린다.");
	}

	@Override
	public void stop() {
		System.out.println("브레이크를 잡는다. ");
	}

	@Override
	public String name() {
		return "자전거";
	}

}
