package ex01.collection.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapex02 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("현수", new Integer(90));
		map.put("제민", new Integer(900));
		map.put("다혜", new Integer(1000));
		map.put("수오", new Integer(80));
		map.put("병민", new Integer(56));
		
//		Set set = map.entrySet();
//		Iterator it = set.iterator();
		Iterator it = map.entrySet().iterator();
		
		while( it.hasNext() ) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("name: " + e.getKey() + ", score : " + e.getValue());
		}
		
		Set set = map.keySet();
		System.out.println("참가자 명단 : " + set);
		
		Collection values = map.values();
		it = values.iterator();
		
		int total = 0;
		while( it.hasNext()) {
			Integer i = (Integer)it.next();
			total += i.intValue();
		}
		
		System.out.println("total : " + total);
		System.out.println("avg : " + (float)total / set.size());
		System.out.println("max score : " + Collections.max(values));
		System.out.println("min score : " + Collections.min(values));
	}
}










