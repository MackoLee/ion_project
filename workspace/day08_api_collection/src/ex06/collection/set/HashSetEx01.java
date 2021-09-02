package ex06.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashSetEx01 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("키보드");
		hs.add("키보드");
		
		System.out.println("요소 개수 : " + hs.size());
		
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}
}
