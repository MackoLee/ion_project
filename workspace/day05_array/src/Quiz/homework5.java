package Quiz;

public class homework5 {
	String name, phone, address;
	homework5(String name, String phone, String address){
		this.name=name;
		this.phone=phone;
		this.address=address;
	}
	public static void main(String[] args) {
		homework5 h = new homework5("이상옥","01025272927","서초구");
		h.info();
	}
	public void info() {
		System.out.println("이름 : "+this.name+" 연락처 : "+this.phone+" 주소 : "+this.address);
	}
}
