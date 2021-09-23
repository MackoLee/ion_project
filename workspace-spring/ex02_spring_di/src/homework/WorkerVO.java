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
		System.out.println("직원 "+this.getName()+"이/가 움직였습니다.");
	}

	@Override
	public void sleep() {
		System.out.println("직원 "+this.getName()+"이/가 잠들었습니다.");
	}

	@Override
	public void eat() {
		System.out.println("직원 "+this.getName()+"이/가 먹습니다.");
	}

}
