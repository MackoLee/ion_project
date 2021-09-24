package ex05.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

// XML ��� POJO ����� AspectJ�� �̿��� AOP ���
public class LogAdvice {
//	Around ����� ����/���� ó�� AOP around ������� �Ҷ���
//	�μ��� ProceedingJoinPoint, ���� - Object �Լ�
	
	public Object arround(ProceedingJoinPoint point) throws Throwable{
		String methodName = point.getKind();
		String methodName2 = point.getSignature().getName();

		System.out.println("[LOG ] methodName = "+methodName);
		System.out.println("[LOG ] methodName2 = "+methodName2);
		
		StopWatch sw = new StopWatch();
		
		sw.start(methodName);
		
		Object result = point.proceed();
		
		sw.stop();
		System.out.println("[LOG ] "+methodName +"ȣ���� �Ϸ�Ǿ����ϴ�.");
		System.out.println("[LOG ] "+methodName2 +"ȣ���� �Ϸ�Ǿ����ϴ�.");
		System.out.println("[LOG ] ����ð� : "+sw.getLastTaskTimeMillis());
		
		return null;
	}
}
