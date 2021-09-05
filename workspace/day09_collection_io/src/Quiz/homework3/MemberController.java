package Quiz.homework3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MemberController {
	MemberView memberView = new MemberView();
	BufferedReader input = new BufferedReader( new InputStreamReader(System.in) );
	Map<String,Member> members;
	
	public MemberController() {
		memberView = new MemberView();
		members = new HashMap<String,Member>();
	}
	
	public void run() {
		end:
		while(true){
			switch (readCmd()) {
				case 1:
					add();
					break;
				case 2:
					remove();
					break;
				case 3:
					edit();
					break;
				case 4:
					break;
				default: break end;
			}
		}
	}
	
	public void add() {
		String name =readName();
		members.put(name,new Member(name, readHeight(), readWeight()));
	}
	public void remove() {
		memberView.setStr("삭제하고자하는 ");
		String name =readName();
		members.remove(name);
	}
	public void edit() {
		memberView.setStr("수정하고자하는 ");
		String name =readName();
		members.remove(name);
	}
	
	public int readCmd() {
		while(true) {
			try {
				memberView.setStr("멤버 (추가 : 1, 제거 : 2, 수정 : 3,  종료 : 0) \n");
				memberView.addStr(members+"\n");
				int num = new Integer(input.readLine());
				if(num<0 || 3<num) throw new IOException();
				return num;
			}catch(IOException e) {
				e.printStackTrace();
				memberView.setStr("입력이 잘못됐습니다. 다시 입력해주세요.\n");
			}
		}
	}
	
	public String readName() {
		while(true) {
			try {
				memberView.addStr("이름을 입력해 주세요. ");
				String str = input.readLine();
				memberView.addStr(str+"\n");
				return str;
			}catch(IOException e) {
				e.printStackTrace();
				memberView.setStr("입력이 잘못됐습니다. 다시 입력해주세요.\n");
			}
		}
	}
	public double readHeight() {
		while(true) {
			try {
				memberView.addStr("키를 입력해 주세요.");
				Double num = new Double(input.readLine());
				memberView.addStr(num+"\n");
				return num;
			}catch(IOException e) {
				e.printStackTrace();
				memberView.setStr("입력이 잘못됐습니다. 다시 입력해주세요.\n");
			}
		}
	}
	public double readWeight() {
		while(true) {
			try {
				memberView.addStr("몸무게를 입력해 주세요.");
				Double num = new Double(input.readLine());
				memberView.addStr(num+"\n");
				return num;
			}catch(IOException e) {
				e.printStackTrace();
				memberView.setStr("입력이 잘못됐습니다. 다시 입력해주세요.\n");
			}
		}
	}
}
