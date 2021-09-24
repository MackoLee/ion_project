package ex05.spring.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ex06.spring.aop_Quiz.Employee;
import ex06.spring.aop_Quiz.Student;

public class MainEntry {
	@Autowired
	private Student Print;

	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ex05/spring/aop/ctx.xml");
		
//		Print student = (Print)context.getBean("student");
//		student.show();
//		
//		Print employee = (Print)context.getBean("employee");
//		employee.show();
		Student student = context.getBean("student",Student.class);
		student.show();
		
		Employee employee = context.getBean("employee",Employee.class);
		employee.show();
	}
}
