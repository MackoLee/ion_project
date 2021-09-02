package Quiz.homework3;

public class MemberView { //View는 따로 모델을 가지고 있으면 안된다.

	
	public Boolean add() { 

		System.out.println("이름을 입력해 주세요 : ");
		String name = input.readLine();
		System.out.println("키를 입력해 주세요 : ");
		Double height = new Double(input.readLine());
		System.out.println("몸무게를 입력해 주세요 : ");
		Double weight = new Double(input.readLine());
	}
}
