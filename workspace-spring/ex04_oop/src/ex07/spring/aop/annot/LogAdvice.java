package ex07.spring.aop.annot;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.util.StopWatch;



// XML 기반 POJO 방식의 AspectJ를 이용한 AOP 방법
@Aspect
public class LogAdvice {
//	Around 방식의 사전/사후 처리 AOP around 방식으로 할때는
//	인수는 ProceedingJoinPoint, 리턴 - Object 함수
	
	//  @Pointcut("execution(public void get*(..))")   // public void인 모든 get메소드
	//  @Pointcut("execution(* kr.edu.kosta.*.*())")   // kr.edu.kosta 패키지에 파라미터가 없는 모든 메소드
	//  @Pointcut("execution(* kr.edu.kosta..*.*())")   // kr.edu.kosta 패키지 & kr.edu.kosta 하위 패키지에 파라미터가 없는 모든 메소드
	//  @Pointcut("execution(* kr.edu.kosta.Worker.*())")   // kr.edu.kosta.Worker 안의 모든 메소드
	
	//  @Pointcut("within(kr.edu.kosta.*)")   //kr.edu.kosta 패키지 안에 있는 모든 메소드
	//  @Pointcut("within(kr.edu.kosta..*)")  //kr.edu.kosta 패키지 및 하위 패키지 안에 있는 모든 메소드
	//  @Pointcut("within(kr.edu.kosta.Worker)") //kr.edu.kosta.Worker 모든 메소드
	  
	//  @Pointcut("bean(student)")   //student 빈에만 적용
    //  @Pointcut("bean(*ker)")   //~ker로 끝나는 빈에만 적용
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
		System.out.println("[LOG ] "+methodName +"호출이 완료되었습니다.");
		System.out.println("[LOG ] "+methodName2 +"호출이 완료되었습니다.");
		System.out.println("[LOG ] 실행시간 : "+sw.getLastTaskTimeMillis());
		
		return null;
	}
	
	@Before("pointCut()")
	public void before() {
		System.out.println("이전에 실행");
	}
	
	
}
