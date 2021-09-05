package Quiz.homework2;

public class EmployView {
	String str="********프로그램 시작*********\n";
	public EmployView() {
		draw(); //시작됐으니깐 화면을 뿌려줌.
	}
	
	public void clear() {
		int i=100;
		while(i-- > 0) System.out.println("");
	}
	public void draw() { //화면을 뿌려줌.
		clear();
		System.out.print(str);
	}
	
	public void setStr(String str) {
		this.str=str;
		draw(); //값이 바뀌었으니깐 그려줌.
	}
	public void addStr(String str) {
		this.str+=str;
		draw(); //값이 바뀌었으니깐 그려줌.
	}
}
