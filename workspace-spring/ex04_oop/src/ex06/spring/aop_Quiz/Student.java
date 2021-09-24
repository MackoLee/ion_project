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
		str+="이름 : ";
		str+=name;
		str+=", 학년 : ";
		str+=grade;
		str+=", 반 : ";
		str+=group;
		System.out.println(str);
	}
}
