package ex04.stringBuffer;

public class StringBuffer01 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb);
		
		sb.append(" is pencil");
		System.out.println(sb);
		
		sb.insert(7, " my");
		System.out.println(sb);
		
		sb.setLength(5);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		sb.setLength(20);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
	}
}
