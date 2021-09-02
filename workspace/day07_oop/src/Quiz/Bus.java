package Quiz;

public class Bus implements Trans {

	@Override
	public void start() {
		System.out.println("문이 닫힘니다. 부르르릉");
	}

	@Override
	public void stop() {
		System.out.println("이번역은 아이온커뮤니케이션즈역 입니다. 끼이익");
	}

	@Override
	public String name() {
		return "버스";
	}

}
