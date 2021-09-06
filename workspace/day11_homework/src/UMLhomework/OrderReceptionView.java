package UMLhomework;

import java.io.*;


public class OrderReceptionView {
	BufferedReader input;
	private OrderReception orderReception;
	public OrderReceptionView() throws IOException {
		orderReception=new OrderReception();
		input= new BufferedReader(new InputStreamReader(System.in));
		
		end: while(true) {
			switch (modeOrder()) {
				case 1: readOrder() break;
				case 2:  break;
				default: break end;
			}//end switch
			
		}//end while
		input.close();
	}
	public int modeOrder() {
		int mode;
		while(true) {
			try {
				System.out.println();
				System.out.println();
				System.out.println("모드를 입력해주세요.(1. 수주등록 2. 수주취소 3.프로그램종료) ");
				mode=new Integer(input.readLine());
				if(mode<1 || 3<mode) throw new IOException();
				break;
			}catch(IOException e){
				e.printStackTrace();
				System.out.println("1, 2, 3 중 하나를 입력해주세요.");
			}catch(NumberFormatException e) {
				e.printStackTrace();
				System.out.println("숫자를 입력해주세요.");
			}
		}
		return mode;
	}
	
	public void readOrder() {
		
	}
	
	
}
