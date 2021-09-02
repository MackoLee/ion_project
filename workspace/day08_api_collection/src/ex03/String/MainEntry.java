package ex03.String;

public class MainEntry {
	public static void main(String[] args) {
		int x = 999;
		String str = "abc";
		System.out.println("str : " + str);
		System.out.println(str.hashCode());
		char[] data = {'a','b','c'};
		str = new String(data);
		System.out.println("str : " + str);
		System.out.println(str.hashCode());
		
		str = "korea";
		System.out.println("str : " + str);
		System.out.println(str.hashCode());
		//새로운 글자를 채워 넣으면 다른 글자가 됨.
		str = "busan";
		System.out.println("str : " + str);
		System.out.println(str.hashCode());
		String str2 = "busan";
		System.out.println(str==str2); //같다.
		str+="a";
		System.out.println(str==str2); //다르다.
		str2 = new String("busana");
		System.out.println(str==str2); //다르다.
		
		StringBuffer s = new StringBuffer("str"); //주소값을 공유한다.
		StringBuffer s1 =s;
		s1.append('c');
		System.out.println(s);
		String msg = "cdefghij";
		System.out.println("deagu "+msg);
		
		msg = msg.concat("dld");
		System.out.println(msg);
		String s4 ="abcdef".substring(2);
		System.out.println(s4);
		
		String s5 = "abcdefghijeiwrw".substring(2,5);
		System.out.println(s5);
		
		
		
	}
}
