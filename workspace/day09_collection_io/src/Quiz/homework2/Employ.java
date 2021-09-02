package Quiz.homework2;

public class Employ { //Model
	private String name, phone, partition, position;

	public Employ(String name, String phone, String partition, String position) {
		this.name = name;
		this.phone = phone;
		this.partition = partition;
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public String getPartition() {
		return partition;
	}

	public String getPosition() {
		return position;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setPartition(String partition) {
		this.partition = partition;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "이름 = " + name + ", 전화번호 = " + phone + ", 부서 = " + partition + ", 직급 = " + position;
	}
	
	
}
