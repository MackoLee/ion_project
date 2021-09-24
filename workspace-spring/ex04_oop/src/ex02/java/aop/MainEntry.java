package ex02.java.aop;

import java.lang.reflect.Proxy;

public class MainEntry {
	public static void main(String[] args) {
		CalcImpl c = new CalcImpl();
		
		//// 위는 아무런 로그가 안뜸
		
		//유사하게 만들 수 있다.
		Calc proxy = (Calc)Proxy.newProxyInstance(
				c.getClass().getClassLoader(), // loader : 클래스 찾기 
				c.getClass().getInterfaces(), // interfaces : 행위(함수)
				new LogPringHandlerImpl(c)); // h : 보조업무 구현
		

		System.out.println(c.add(1, 2));
		System.out.println(c.mul(10, 2));
		
		System.out.println(proxy.add(1, 3));
	}
}
