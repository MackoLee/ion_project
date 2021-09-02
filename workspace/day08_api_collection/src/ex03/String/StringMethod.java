package ex03.String;

public class StringMethod {
	public static void main(String[] args) {
		String s1="aaa";
		String s2="SEOUL";
		System.out.println(s2.replace("EO", "korea"));
		System.out.println(s2);

		s1=s1+s2;
		System.out.println(s1);
		String s3 = new String("    ab    cd    ");
		System.out.println(s3);
		System.out.println(s3.length());
		s3 = s3.trim();// 양쪽 공백 제거
		System.out.println(s3);
		System.out.println(s3.length());
		String s4 = new String("ab/defgh/2434523/kiuiw/87387");
		//String s4 = new String("ab defgh 2434523 kiuiw 87387");
		String[] s5 = s4.split("/");
		System.out.println(s5.length);
		System.out.println("*************************");
		String s6="1234567890def 3548238 gure string";
		char ch = s6.charAt(0);
		char[] ch_arr = s6.toCharArray();
		
		System.out.println("소문자 출력 : " + s2.toLowerCase());
		System.out.println("대문자 출력 : " + s2.toUpperCase());
	}
}
