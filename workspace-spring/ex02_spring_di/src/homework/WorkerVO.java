package homework;

public class WorkerVO extends PersonVO implements Person{
	String position, partition;
	
	
	
	public WorkerVO(String name, String position, String partition) {
		super(name);
		this.position = position;
		this.partition = partition;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getPartition() {
		return partition;
	}
	public void setPartition(String partition) {
		this.partition = partition;
	}

	@Override
	public void move() {
		System.out.println("���� "+this.getName()+"��/�� ���������ϴ�.");
	}

	@Override
	public void sleep() {
		System.out.println("���� "+this.getName()+"��/�� �������ϴ�.");
	}

	@Override
	public void eat() {
		System.out.println("���� "+this.getName()+"��/�� �Խ��ϴ�.");
	}

}
