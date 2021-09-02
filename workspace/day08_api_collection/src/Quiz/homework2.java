package Quiz;

import java.util.Scanner;
import java.util.Vector;

import javax.management.AttributeNotFoundException;

public class homework2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Vector<Student> students= new Vector<Student>();
		while(true) {
			try {
				System.out.println("학생과 성적을 추가 하시겠습니까? : (y, n)");
				String check = input.next();
				if(check.equals("n")) break;
				if(!check.equals("y")) throw new AttributeNotFoundException();
				students.add(new Student());
			}catch(Exception e) {
				System.out.println("입력이 잘못되었습니다. 정상적인 입력을 해주세요.");
			}
		}
		System.out.println(students);
	}
}

class Sub{
	String name;
	int score;
	
	Sub(String name, int score){
		this.name=name;
		this.score=score;
	}

	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setScore(int score) {
		this.score = score;
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
	
	public String[] getSub_name() {
		return sub_name;
	}
	public String getName() {
		return name;
	}
	public Sub[] getSub() {
		return sub;
	}
	public void setSub_name(String[] sub_name) {
		this.sub_name = sub_name;
	}
	public void setGrade(char[] grade) {
		this.grade = grade;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSub(Sub[] sub) {
		this.sub = sub;
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
	public String toString() {
		String answer="";
		answer+= "\n****** "+this.name+"의 성적 ******\n";
		for(int i=0;i<sub_name.length;i++)
			answer+=sub_name[i]+"점수 "+sub[i].score+"점, ";
		answer+='\n';
		answer+="평균 : "+getAverage();
		answer+='\n';
		answer+="평점 : "+getGrade();
		
		return answer;
	}
}