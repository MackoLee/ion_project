package ex01.collection.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx03 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(10);
		list.add(10);
		list.add(20);
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(1);
		
		
		ArrayList list2 = new ArrayList(list.subList(1, 4));
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		list2.add('A');
		list2.add("asda");
		System.out.println(list2);
		list.retainAll(list2);
		System.out.println(list);
		
	}
}
