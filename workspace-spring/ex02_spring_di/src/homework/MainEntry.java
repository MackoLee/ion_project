package homework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {
		/* *********************************************************************************/
		// xml 파일 사용.
		ApplicationContext context = new ClassPathXmlApplicationContext("homework/ctx.xml");
		
		StudentView view = context.getBean("studentView",StudentView.class);
		view.print();
		
		/* *******************************************************************************/
		// 어노테이션 활용 구현
		AnnotationConfigApplicationContext annocontext = new AnnotationConfigApplicationContext(ctx.class);
		
		WorkerView view2 = annocontext.getBean("workerView",WorkerView.class);
		view2.print();
		

		for()
	}
}
