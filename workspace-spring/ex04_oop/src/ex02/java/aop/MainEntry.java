package ex02.java.aop;

import java.lang.reflect.Proxy;

public class MainEntry {
	public static void main(String[] args) {
		CalcImpl c = new CalcImpl();
		
		//// ���� �ƹ��� �αװ� �ȶ�
		
		//�����ϰ� ���� �� �ִ�.
		Calc proxy = (Calc)Proxy.newProxyInstance(
				c.getClass().getClassLoader(), // loader : Ŭ���� ã�� 
				c.getClass().getInterfaces(), // interfaces : ����(�Լ�)
				new LogPringHandlerImpl(c)); // h : �������� ����
		

		System.out.println(c.add(1, 2));
		System.out.println(c.mul(10, 2));
		
		System.out.println(proxy.add(1, 3));
	}
}
