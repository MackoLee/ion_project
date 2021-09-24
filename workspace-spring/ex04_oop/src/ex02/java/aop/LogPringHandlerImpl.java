package ex02.java.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

public class LogPringHandlerImpl implements InvocationHandler{
	Object target;
	
	//��ü�� ���� ������ ����
	public LogPringHandlerImpl(Object target) {
		this.target=target;
	}
	@Override // ���� ���ɻ縦 ���⿡ �ۼ�
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
		System.out.println("invoke method start~~~~~");

		Log log = LogFactory.getLog(this.getClass());
		StopWatch sw = new StopWatch();
		sw.start();
		
		log.info("Ÿ�̸� ����");
		
		int result = (int)method.invoke(target, args);
		
		sw.stop();
		log.info("Ÿ�̸� ����");

		log.info("[TIME LOG] method : "+ method.getName());
		log.info("[TIME LOG] Process Time : "+ sw.getTotalTimeMillis());
		return result;
	}
	
}
