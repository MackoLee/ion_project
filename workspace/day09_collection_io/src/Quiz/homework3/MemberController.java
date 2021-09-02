package Quiz.homework3;

import java.io.*;
import java.util.Vector;

import Quiz.homework2.Employ;

public class MemberController { //
	MemberView memberView = new MemberView();
	BufferedReader input = new BufferedReader( new InputStreamReader(System.in) );

	static int id = 0; // id 를 static으로 두므로써 다른 EmployView를 선언하면 다른 파일에 저장할 수 있음.
	Vector<Employ> employs;
	FileOutputStream input;
	public MemberController() {
		memberView = new MemberView();
		employs = new Vector<Employ>;
		while(true) {
			try {
				System.out.println("헬스장 회원 : 추가 1, 삭제 2, 목록보기 3, 나가기 0");	
				int cmd = new Integer(input.readLine());
				memberView.add();
				break;
			}
			catch(Exception e){
				e.printStackTrace();
				continue;
			}
			
			
		}
	}
	
}
