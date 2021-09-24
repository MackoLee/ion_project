package ex05.spring.aop;

public class Student implements Print{
	private String name, grade, group;
	private int age;
	
	public Student() {}

	public Student(String name, String grade, String group, int age) {
		super();
		this.name = name;
		this.grade = grade;
		this.group = group;
		this.age = age;
	}
	
	@Override
	public void show() {
		String str="";
		str+="이름 : ";
		str+=name;
		str+=", 나이 : ";
		str+=age;
		str+=", 학년 : ";
		str+=grade;
		str+=", 반 : ";
		str+=group;
		System.out.println(str);
	}
}
