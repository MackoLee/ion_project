package Quiz;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		Videos videos = new Videos();
		Scanner input = new Scanner(System.in);
		end:
		while(true) {
			System.out.println("원하는 명령어를 입력하세요");
			System.out.println("1. 비디오 추가 2. 비디오 수정 3. 비디오 삭제 4. 비디오 목록 0. 나가기");
			int cmd;
			try {
				cmd= new Integer(input.next());
				if(cmd >4 || cmd<0) throw new IndexOutOfBoundsException();
				
				switch (cmd) {
					case 1: //추가
						System.out.println(videos.add(-1)?"성공": "실패"); 
						break;
					case 2: //수정
						System.out.println(videos.edit()?"성공": "실패");
						break;
					case 3: //삭제 
						System.out.println(videos.remove()?"성공": "실패");
						break;
					case 4: //리스트 출력
						System.out.println(videos);
						break;
					default: //반복문 종료
						break end;
				}
			}
			catch(Exception e) {
				e.printStackTrace();
				System.out.println("입력 문자가 잘못되었습니다. 처음부터 입력해주세요.");
				continue;
			}
			
		}
		
	}
}
