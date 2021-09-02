package ex06.collection.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class VectorEx01 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		System.out.println("length : " + v.size() + ",  capacity : "+ v.capacity());
		
		Vector<Integer> v2 = new Vector<Integer>(3,4); //초기용량, 증가용량
		v2.add(2);
		v2.add(new Integer(333));
		v2.add(2);
		v2.add(4);
		System.out.println("length : " + v2.size() + ",  capacity : "+ v2.capacity());
		
		
		System.out.println("--------iterator() method ---------");
		Iterator it = v2.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("------- get() method ---------");
		for (int i = 0; i < v2.size(); i++) {
			System.out.println(v2.get(i));
		}
		
		System.out.println("------- sort result --------");
		Collections.sort(v2); //요소 순서대로 정렬
		for (int i = 0; i < v2.size(); i++) {
			System.out.println(v2.get(i));
		}
		System.out.println("------- elementAt() method ---------");
		for (int i = 0; i < v2.size(); i++) {
			System.out.println(v2.elementAt(i));
		}
		System.out.println("-------- trimToSize() method ---------");
		v2.trimToSize(); // capacity 조정하기 
		System.out.println(v2.size() + "         /                "+ v2.capacity());
		System.out.println(v2);
	}
}
