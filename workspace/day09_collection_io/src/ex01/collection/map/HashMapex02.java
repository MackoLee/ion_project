package ex01.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapex02 {
	public static void main(String[] args) {
		Map map = new HashMap<String, Integer>();
		map.put("상옥",1);
		map.put("상2",20);
		map.put("상3",30);
		map.put("tkdkt", 100);
		
		Set set = map.entrySet(); // set 하나하나에 들어가는건 MapNodeclass 가 들어간다.
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next(); //MapNodeclass 를 key와 value를 가져오기 위해서는 Entry로 바꿔주어야 한다.
			System.out.print(e.getKey()+ " = " + e.getValue() + ", ");
		}
		
		Set set2 = map.keySet(); // set 하나하나에 들어가는건 key값이 들어간다.
		Iterator it2 = map.keySet().iterator();
		
		while(it2.hasNext()) {
			Object key=it2.next();
			System.out.print(key+" = "+map.get(key)+", ");
		}

		Iterator e =  map.values().iterator();
		while(e.hasNext()) {
			System.out.println((Integer)e.next());
		}
		
	}
}
