package ex07.multiImplements;

import ex04.Abstract.Shape;
import ex06.Interface.iDraw;

public class MultiClass extends Shape 
                        implements iDraw, Test {

	@Override
	public void tView() {
		System.out.println("Test interface ");
	}

	@Override
	public void draw() {
		result=1;
		System.out.println("IDraw interface");
	}

	@Override
	public double calc(double x) {
		System.out.println("Shape class");
		return 5.5;
	}

	@Override
	public void show(String name) {
		// TODO Auto-generated method stub

	}

}
