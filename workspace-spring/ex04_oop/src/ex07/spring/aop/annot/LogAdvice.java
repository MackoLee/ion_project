package ex07.spring.aop.annot;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.util.StopWatch;



// XML ��� POJO ����� AspectJ�� �̿��� AOP ���
@Aspect
public class LogAdvice {
//	Around ����� ����/���� ó�� AOP around ������� �Ҷ���
//	�μ��� ProceedingJoinPoint, ���� - Object �Լ�
	
	//  @Pointcut("execution(public void get*(..))")   // public void�� ��� get�޼ҵ�
	//  @Pointcut("execution(* kr.edu.kosta.*.*())")   // kr.edu.kosta ��Ű���� �Ķ���Ͱ� ���� ��� �޼ҵ�
	//  @Pointcut("execution(* kr.edu.kosta..*.*())")   // kr.edu.kosta ��Ű�� & kr.edu.kosta ���� ��Ű���� �Ķ���Ͱ� ���� ��� �޼ҵ�
	//  @Pointcut("execution(* kr.edu.kosta.Worker.*())")   // kr.edu.kosta.Worker ���� ��� �޼ҵ�
	
	//  @Pointcut("within(kr.edu.kosta.*)")   //kr.edu.kosta ��Ű�� �ȿ� �ִ� ��� �޼ҵ�
	//  @Pointcut("within(kr.edu.kosta..*)")  //kr.edu.kosta ��Ű�� �� ���� ��Ű�� �ȿ� �ִ� ��� �޼ҵ�
	//  @Pointcut("within(kr.edu.kosta.Worker)") //kr.edu.kosta.Worker ��� �޼ҵ�
	  
	//  @Pointcut("bean(student)")   //student �󿡸� ����
    //  @Pointcut("bean(*ker)")   //~ker�� ������ �󿡸� ����
	@Pointcut("bean(student)")
	private void pointCut() {}
	
	
	@Around("pointCut()")
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
	
	@Before("pointCut()")
	public void before() {
		System.out.println("������ ����");
	}
	
	
}
