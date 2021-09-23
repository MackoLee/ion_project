package homework;

public class StudentView {
	StudentVO studentVO;

	public StudentVO getStudentVO() {
		return studentVO;
	}

	public void setStudentVO(StudentVO studentVO) {
		this.studentVO = studentVO;
	}
	
	public void print() {
		studentVO.allgrade();
		studentVO.move();
		studentVO.eat();
		studentVO.sleep();
	}
	
}
