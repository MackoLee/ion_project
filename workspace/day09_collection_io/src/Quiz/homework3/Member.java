package Quiz.homework3;

public class Member {
	String name;
	double height, weight;
	public Member(String name, double height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getBMI() {
		return weight/(height*height*0.0001);
	}
	public String getBiman() {
		String[] arr = {"저체중","저체중","저체중","저체중","정상","과체중","비만","비만","비만","비만","고도비만","초고도비만"};
		return arr[(int)getBMI()/5];
	}
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", height=" + height + ", weight=" + weight + ", BMI="+getBMI()+", "+getBiman()+"입니다.]";
	}
	
}
