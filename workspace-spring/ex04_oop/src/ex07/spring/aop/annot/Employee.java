package ex07.spring.aop.annot;

public class Employee{
	private String name, partition, position;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPartition() {
		return partition;
	}
	public void setPartition(String partition) {
		this.partition = partition;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}

	public void show() {
		String str="";
		str+="�̸� : ";
		str+=name;
		str+=", �μ� : ";
		str+=partition;
		str+=", ���� : ";
		str+=position;
		System.out.println(str);
	}
}
