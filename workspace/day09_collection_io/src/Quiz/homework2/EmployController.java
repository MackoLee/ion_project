package Quiz.homework2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

public class EmployController {
	EmployView employView; // view 관리
	Vector<Employ> employs; // employs 관리
	BufferedReader input; // input 관리

	public EmployController() throws IOException {
		employView = new EmployView(); // view 관리
		employs = new Vector<Employ>(); // model 관리
		input = new BufferedReader(new InputStreamReader(System.in)); // input관리

		while (true) {
			try {
				employView.setStr("직원을 계속 추가 하시겠습니까? (y, n) ");
				String cmd = input.readLine();
				if (cmd.equals("n")) break;
				if (!cmd.equals("y")) throw new IOException();

				employView.setStr("어떤 직원입니까? (정규직 : 1, 판매원 : 2, 파트타임 : 3) ");
				int kind = new Integer(input.readLine());
				if(kind<1 || kind>3) throw new IOException();
				switch (kind) { // 직원이 어떤 직원인지 확인
					case 1: // 정규직
						employs.add(getRegular());
						break;
					case 2: // 판매원
						employs.add(getSales());
						break;
					case 3: // 파트타임
						employs.add(getPartTime());
						break;
				}
			} catch (IOException e) {
				e.printStackTrace();
				employView.setStr("입력이 잘못되었습니다. 다시 입력해주세요.\n");
			}
		}
		writeFile();
		// 파일로 출력
	}

	void writeFile() throws IOException {
		File file = new File("Employ.txt");
		if (!file.exists())
			file.createNewFile();
		FileOutputStream os = new FileOutputStream(file);
		employView.setStr("******파일 입출력*******\n");
		int i = 1;
		for (Employ employ : employs) {
			String str = i++ + " : " + employ + "\t\n";
			employView.addStr(str);
			os.write(str.getBytes());
		}
		employView.addStr("성공");
	}
	

	public Regular getRegular() {
		return new Regular(readName(),readPhone(),readPartition(),readPosition(),readPay());
	}
	public Sales getSales() {
		return new Sales(readName(),readPhone(),readPartition(),readPosition(),readPay(),readCommition());
	}
	public PartTime getPartTime() {
		return new PartTime(readName(),readPhone(),readPartition(),readPosition(),readWorkTime(),readWorkDay());
	}
	
	public String readName() {
		while(true) {
			try {
				employView.setStr("이름을 입력해 주세요. ");
				String str = input.readLine();
				employView.addStr(str+"\n");
				return str;
			}catch(IOException e) {
				e.printStackTrace();
				employView.setStr("입력이 잘못됐습니다. 다시 입력해주세요.\n");
			}
		}
	}
	
	public String readPhone() {
		while(true) {
			try {
				employView.addStr("핸드폰 번호를 입력해 주세요. ");
				String str = input.readLine();
				employView.addStr(str+"\n");
				return str;
			}catch(IOException e) {
				e.printStackTrace();
				employView.setStr("입력이 잘못됐습니다. 다시 입력해주세요.\n");
			}
		}
	}
	public String readPartition() {
		while(true) {
			try {
				employView.addStr("부서를 입력해 주세요. ");
				String str = input.readLine();
				employView.addStr(str+"\n");
				return str;
			}catch(IOException e) {
				e.printStackTrace();
				employView.setStr("입력이 잘못됐습니다. 다시 입력해주세요.\n");
			}
		}
	}
	public String readPosition() {
		while(true) {
			try {
				employView.addStr("직책를 입력해 주세요. ");
				String str = input.readLine();
				employView.addStr(str+"\n");
				return str;
			}catch(IOException e) {
				e.printStackTrace();
				employView.setStr("입력이 잘못됐습니다. 다시 입력해주세요.\n");
			}
		}
	}
	public int readPay() {
		while(true) {
			try {
				employView.addStr("월급을 입력해주세요.");
				Integer num = new Integer(input.readLine());
				employView.addStr(num+"\n");
				return num;
			}catch(IOException e) {
				e.printStackTrace();
				employView.setStr("입력이 잘못됐습니다. 다시 입력해주세요.\n");
			}
		}
	}

	public double readCommition() {
		while(true) {
			try {
				employView.addStr("커미션을 입력해 주세요.");
				Double num = new Double(input.readLine());
				employView.addStr(num+"\n");
				return num;
			}catch(IOException e) {
				e.printStackTrace();
				employView.setStr("입력이 잘못됐습니다. 다시 입력해주세요.\n");
			}
		}
	}

	public int readWorkTime() {
		while(true) {
			try {
				employView.addStr("일한 시간을 입력해주세요.");
				Integer num = new Integer(input.readLine());
				employView.addStr(num+"\n");
				return num;
			}catch(IOException e) {
				e.printStackTrace();
				employView.setStr("입력이 잘못됐습니다. 다시 입력해주세요.\n");
			}
		}
	}

	public int readWorkDay() {
		while(true) {
			try {
				employView.addStr("일한 날을 입력해주세요.");
				Integer num = new Integer(input.readLine());
				employView.addStr(num+"\n");
				return num;
			}catch(IOException e) {
				e.printStackTrace();
				employView.setStr("입력이 잘못됐습니다. 다시 입력해주세요.\n");
			}
		}
	}
	
}
