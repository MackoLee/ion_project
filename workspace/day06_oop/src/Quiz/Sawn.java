package Quiz;

public class Sawn {
	private int pay;
	private String name, position, partition, phone;
	public int getPay() {
		return pay;
	}
	public String getName() {
		return name;
	}
	public String getPosithion() {
		return position;
	}
	public String getPartition() {
		return partition;
	}
	public String getPhone() {
		return phone;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPosithion(String position) {
		this.position = position;
	}
	public void setPartition(String partition) {
		this.partition = partition;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Sawn(int pay, String name, String position, String partition, String phone) {
		super();
		this.pay = pay;
		this.name = name;
		this.position = position;
		this.partition = partition;
		this.phone = phone;
	}
	public Sawn(int pay, String name, String phone) {
		super();
		this.pay = pay;
		this.name = name;
		this.phone = phone;
	}
	public void info() {
		System.out.println(" 사원명 : "+name+" 직급 : "+position+" 부서 : "+partition+" 급여 : "+pay );
	}
	
	
}
