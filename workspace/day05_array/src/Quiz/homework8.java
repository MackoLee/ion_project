package Quiz;

import java.util.Scanner;

public class homework8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int INWON = 3;

		Student[] students=new Student[INWON];
		
		for(int i=0;i<INWON;i++) {
			students[i]=new Student();
		}
		for(int i=0;i<INWON;i++) {
			students[i].output();
		}
		
	}
}

class Sub{
	String name;
	int score;
	
	Sub(String name, int score){
		this.name=name;
		this.score=score;
	}
}
class Student{
	String[] sub_name= {"국어", "영어", "수학"};
	char[] grade = {'F','F','F','F','F','F','D','C','B','A','A'};

	String name;
	Sub sub[];
	Student(){
		this.Input();
	}
	public void Input() {
		Scanner sc = new Scanner(System.in);

		System.out.println("이름을 입력하세요 : ");
		this.name = sc.next();
		this.sub=new Sub[this.sub_name.length];
		for(int i=0;i<this.sub_name.length;i++) {
			int score;
			do {
				System.out.print(sub_name[i] + "점수 : (0~100)");
				score=sc.nextInt();
			}while(score<0 || 100<score);
			this.sub[i] = new Sub(sub_name[i],score);
		}
	}
	public int getTotal() {
		int answer=0;
		for(Sub s:this.sub) {
			answer+=s.score;
		}
		return answer;
	}
	public double getAverage() {
		return (double) getTotal()/this.sub.length;
	}
	public char getGrade() {
		return grade[getTotal()/(sub_name.length*10)];
	}
	public void output() {
		String answer="";
		answer+= "****** "+this.name+"의 성적 ******\n";
		for(int i=0;i<sub_name.length;i++)
			answer+=sub_name[i]+"점수 "+sub[i].score+"점, ";
		answer+='\n';
		answer+="평균 : "+getAverage();
		answer+='\n';
		answer+="평점 : "+getGrade();
		
		System.out.println(answer);
	}
}
