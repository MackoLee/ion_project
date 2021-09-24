package homework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		/* *********************************************************************************/
		// xml ���� ���.
		ApplicationContext context = new ClassPathXmlApplicationContext("homework/ctx.xml");
		
		StudentView view = context.getBean("studentView",StudentView.class);
		view.print();
		
		/* *******************************************************************************/
		// ������̼� Ȱ�� ����
		AnnotationConfigApplicationContext annocontext = new AnnotationConfigApplicationContext(ctx.class);
		
		WorkerView view2 = annocontext.getBean("workerView",WorkerView.class);
		view2.print();
		

		for()
	}
}
