package ex01.collection.list;

import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;


public class VectorEx02 {
	public static void main(String[] args) {
		int i;
		Date date = new Date();
		Vector v = new Vector(3,5);

		v.add("자바"); //string
		v.addElement(new Double(10.2));
		v.addElement(date);
		v.add(1);
		Iterator it = v.iterator();
		
		Enumeration e= v.elements();
		while(e.hasMoreElements()) {
			System.out.print(e.nextElement()+ ", ");
		}
		
		System.out.println("\n------객체 내용 포함 ------");
		if(v.contains("자바1")) System.out.println("해당 객체 있습니다.");
		else System.out.println("해당 객체 미포함");
		
		System.out.println("10.2 객체 위치는? "+ v.indexOf(e));
		System.out.println(v);
		v.remove((Object)1);
		System.out.println(v);
		v.trimToSize();
	}
}
