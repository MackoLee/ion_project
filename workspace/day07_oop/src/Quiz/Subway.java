package Quiz;

public class Subway implements Trans {

	@Override
	public void start() {
		System.out.println("칙칙폭폭");
	}

	@Override
	public void stop() {
		System.out.println("끼이이이이이익!");
	}

	@Override
	public String name() {
		return "기차";
	}

}
