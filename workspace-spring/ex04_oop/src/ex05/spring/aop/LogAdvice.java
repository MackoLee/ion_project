package ex05.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

// XML 기반 POJO 방식의 AspectJ를 이용한 AOP 방법
public class LogAdvice {
//	Around 방식의 사전/사후 처리 AOP around 방식으로 할때는
//	인수는 ProceedingJoinPoint, 리턴 - Object 함수
	
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
}
