package ex3.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainEntry {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ex3/spring/aop/appCtx.xml");
		
		// Proxy ����� ��ü�� �ѱ��, �ʿ��� ��ü�� �����ϴ� �۾��� �̹� xml ���� ������ ���ؼ� ������.
		Calc proxy = context.getBean("proxy",Calc.class);

		System.out.println(proxy.add(1, 2, 3));
		System.out.println(proxy.sub(1, 2, 3));
		System.out.println(proxy.mul(1, 2));
		
	}
}
