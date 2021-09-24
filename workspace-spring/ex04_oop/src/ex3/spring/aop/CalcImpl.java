package ex3.spring.aop;

public class CalcImpl implements Calc {

	@Override
	public int add(int x, int y, int z) {
		return x+y+z;
	}

	@Override
	public int mul(int x, int y) {
		return x*y;
	}

	@Override
	public int sub(int x, int y, int z) {
		return x-y-z;
	}

}
