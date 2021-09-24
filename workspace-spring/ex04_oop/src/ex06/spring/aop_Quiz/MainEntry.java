package ex06.spring.aop_Quiz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ex06/spring/aop_Quiz/ctx.xml");
		
		Student student = context.getBean("student",Student.class);
		student.show();
		
		Employee employee = context.getBean("employee",Employee.class);
		employee.show();
	}
}
