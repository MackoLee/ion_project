package Quiz;

import java.security.KeyException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Videos { // Views
	Map<String, Map> videos;
	int no;

	public Videos() {
		videos = new HashMap<String, Map>();
		no = 0;
	}

	public Boolean add(int no) {
		try {
			Scanner input = new Scanner(System.in);
			System.out.println("제목을 추가해주세요.");
			String title = input.nextLine();
			System.out.println("카테고리를 입력해주세요. ");
			String category = input.nextLine();
			System.out.println("대여여부");
			String lend = input.nextLine();
			System.out.println("대여자명");
			String lendName = input.nextLine();
			Date lendDate = new Date();
			
			Map video = (videos.containsKey(title)?videos.get(title):new HashMap<Integer, Video>()); //key를 가지고 있으면 그대로 가져오고 아니면 새로 만든다.
			video.put((no==-1?this.no++:no), new Video(title, category, lend, lendName, lendDate));

			videos.put(title, video);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public Boolean remove() {
		try {
			Scanner input = new Scanner(System.in);
			System.out.println("삭제하고 싶은 비디오 제목을 입력해주세요. ");
			String title = input.nextLine();
			Map video = videos.get(title);

			if (video.isEmpty()) return false; // 들어 있는게 없어서 실패

			if (video.size() == 1) { // 1개일떄
				videos.remove(title);
				return true;
			}

			// 2개 이상
			System.out.println(video);

			System.out.print("지우고 싶은 비디오의 번호를 입력해주세요 : ");
			int no = input.nextInt();
			if(!video.containsKey(no)) throw new KeyException(); //키가 포함되어 있지 않으면 에러 발생
			
			video.remove(no);
			videos.put(title,video);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public Boolean edit() {
		try {
			Scanner input = new Scanner(System.in);
			System.out.println("수정하고 싶은 비디오 제목을 입력해주세요. ");
			String title = input.nextLine();
			Map video = videos.get(title);

			if (video.isEmpty()) return false; // 들어 있는게 없어서 실패

			System.out.println(video);

			System.out.print("수정하고 싶은 비디오의 번호를 입력해주세요 : ");
			int no = input.nextInt();
			if(!video.containsKey(no)) throw new KeyException(); //키가 포함되어 있지 않으면 에러 발생
			System.out.println(video.get(no));
			video.remove(no);
			videos.put(title,video);
			add(no);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public String toString() {
		return videos.toString();
	}
}

class Video { // Model
	String title, category, lend, lendName;
	Date lendDate;

	public Video(String title, String category, String lend, String lendName, Date lendDate) {
		this.title = title;
		this.category = category;
		this.lend = lend;
		this.lendName = lendName;
		this.lendDate = new Date();
	}

	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

	public String getLend() {
		return lend;
	}

	public String getLendName() {
		return lendName;
	}

	public Date getLendDate() {
		return lendDate;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setLend(String lend) {
		this.lend = lend;
	}

	public void setLendName(String lendName) {
		this.lendName = lendName;
	}

	public void setLendDate(Date lendDate) {
		this.lendDate = lendDate;
	}

	@Override
	public String toString() {
		return "Video [제목 : " + title + ", 카테고리 : " + category + ", 대여여부 : " + lend + ", 대여자 : " + lendName
				+ ", 대여날짜 : " + lendDate + "]\n";
	}
	
}
