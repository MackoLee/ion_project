package algorithm;

import java.util.*;

class Tuple implements Comparable<Tuple>{
	private int[] x;
	public Tuple(int...x) {
		this.x=x;
	}
	public int compareTo(Tuple y) {
		int i=0;
		for(;i<x.length-1;i++) {
			if(this.x[i]!=y.x[i]) return this.x[i]-y.x[i];
		}
		return this.x[i]-y.x[i];
	}
	
	@Override
	public String toString() {
		String answer="";
		for(int k : x) {
			answer+=k+" ";
		}
		return answer;
	}
}

class Match{
	
}

public class 복서정렬하기 {
    static int[] solution(int[] weights, String[] head2head) {
        int[] answer = {};
        PriorityQueue<Tuple> t= new PriorityQueue<Tuple>();
        t.add(new Tuple(1,2,2));
        t.add(new Tuple(1,2,3));
        t.add(new Tuple(1,2,1));

        while(!t.isEmpty()) {
        	System.out.println(t.poll());
        }
        
        return answer;
    }
}
