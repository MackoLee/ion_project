package ex3.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainEntry {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ex3/spring/aop/appCtx.xml");
		
		// Proxy 만들고 객체를 넘기고, 필요한 객체를 생성하는 작업은 이미 xml 설정 파일을 통해서 설정함.
		Calc proxy = context.getBean("proxy",Calc.class);

		System.out.println(proxy.add(1, 2, 3));
		System.out.println(proxy.sub(1, 2, 3));
		System.out.println(proxy.mul(1, 2));
		
	}
}
