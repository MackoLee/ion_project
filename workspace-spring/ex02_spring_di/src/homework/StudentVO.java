package homework;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class StudentVO extends PersonVO implements Person{
	Map<String, Integer> subs;

	
	
	public Map<String, Integer> getSubs() {
		return subs;
	}
	public void setSubs(Map<String, Integer> subs) {
		this.subs = subs;
	}
	public StudentVO(String name, Map<String, Integer> subs) {
		super(name);
		this.subs=subs;
	}
	public StudentVO() {
		super();
	}
	
	public void allgrade() {
		Iterator sub=  subs.entrySet().iterator();
		
		while(sub.hasNext()) {
			Entry next = (Entry)sub.next();
			System.out.println(next.getKey()+" : "+next.getValue());
		}
	}
	
	@Override
	public void move() {
		System.out.println("학생 "+this.getName()+"이/가 움직였습니다.");
	}

	@Override
	public void sleep() {
		System.out.println("학생 "+this.getName()+"이/가 잠들었습니다.");
	}

	@Override
	public void eat() {
		System.out.println("학생 "+this.getName()+"이/가 먹습니다.");
	}

}
