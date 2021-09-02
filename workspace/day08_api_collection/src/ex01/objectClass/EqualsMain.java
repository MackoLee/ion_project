package ex01.objectClass;

class Circle{
	int x,y;
}

public class EqualsMain {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		
		System.out.println("c1 : "+c1.hashCode());
		System.out.println("c2 : "+c2.hashCode());
		
		if(c1 == c2) System.out.println("same"); //서로의 주소를 비교한다.
		else System.out.println("diffrent");
		
		
		int x=3, y=3;
		System.out.println("기본 자료형 비교");
		if(x==y) System.out.println("same");
		else System.out.println("diffrent");
		
		String str1=new String("korea"), str2=new String("korea");
		
		System.out.println("참조 자료형 비교");
		if(str1.hashCode()==str2.hashCode()) System.out.println("same");
		else System.out.println("diffrent");
		
		System.out.println("******* equals() method 비교 **********");
		System.out.println("참조 자료형 비교");
		if(str1.equals(str2)) System.out.println("same");
		else System.out.println("diffrent");
		
		
	}
}
