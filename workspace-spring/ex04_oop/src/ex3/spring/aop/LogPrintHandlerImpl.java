package ex3.spring.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

public class LogPrintHandlerImpl implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("invoke method start~~~~~~");
		
		//보조 업무 구현

		Log log = LogFactory.getLog(this.getClass());
		StopWatch sw = new StopWatch();
		sw.start();
		
		log.info("타이머 시작");
		
		//////////////////////////////
		Object result = invocation.proceed();
		//////////////////////////////
	
		sw.stop();
		log.info("타이머 정지");

		log.info("[TIME LOG] method : "+ invocation.getMethod());
		log.info("[TIME LOG] Process Time : "+ sw.getTotalTimeMillis());
		return result;
	}
}
