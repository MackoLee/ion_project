package ex06.spring.aop_Quiz;

public class Student{
	private String name, group, grade;
	public Student() {}

	public Student(String name, String group, String grade) {
		super();
		this.name = name;
		this.grade = grade;
		this.group = group;
	}
	
	public void show() {
		String str="";
		str+="�̸� : ";
		str+=name;
		str+=", �г� : ";
		str+=grade;
		str+=", �� : ";
		str+=group;
		System.out.println(str);
	}
}
