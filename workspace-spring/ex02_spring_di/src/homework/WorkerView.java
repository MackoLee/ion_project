package homework;

public class WorkerView {
	private WorkerVO workerVO;
	
	public WorkerVO getWorkerVO() {
		return workerVO;
	}

	public void setWorkerVO(WorkerVO workerVO) {
		this.workerVO = workerVO;
	}

	public void print() {
		System.out.println(workerVO.getName() + workerVO.getPartition() + workerVO.getPosition());
		workerVO.move();
		workerVO.eat();
		workerVO.sleep();
	}
}
