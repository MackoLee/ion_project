package Quiz;

public class MainEntry {
	public static void main(String[] args) {
		Trans[] arrays = {new Bicycle(), new Bus(), new Subway(), new Plain()};
		
		for(Trans array : arrays) {
			array.start();
			array.stop();
		}
	}
}
