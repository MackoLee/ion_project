package Quiz;

public class Plain implements Trans{

	@Override
	public void start() {
		System.out.println("부부부붕");
	}

	@Override
	public void stop() {
		System.out.println("턱 턱 두두두 둥~");
	}

	@Override
	public String name() {
		return "비행기";
	}

}
