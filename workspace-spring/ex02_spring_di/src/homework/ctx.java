package homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ctx {
	@Bean
	public WorkerVO workerVO(){
		return new WorkerVO("�̻��","����","��ȹ������");
	}
	@Bean
	public WorkerView workerView() {
		WorkerView workerView = new WorkerView();
		workerView.setWorkerVO(workerVO());
		return workerView;
	}
}
