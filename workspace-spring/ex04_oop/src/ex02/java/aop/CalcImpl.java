package ex02.java.aop;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

public class CalcImpl implements Calc{
	@Override
	public int add(int x, int y) {
		int result =x+y;
		return result;
	}
	@Override
	public int mul(int x, int y) {
		int result = x*y;
		return result;
	}
}
