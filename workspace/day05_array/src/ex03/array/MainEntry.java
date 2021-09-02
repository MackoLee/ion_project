package ex03.array;

import java.util.Iterator;

public class MainEntry {

	public static void main(String[] args) {
		int [][][] a = new int[2][2][3];
		int x=0;
		
		System.out.println("면 = " + a.length);
		System.out.println("행 = " + a[0].length);
		System.out.println("열 = " + a[0][0].length);
		
		//input
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int k = 0; k < a[i][j].length; k++) {
					//a[i][j][k]=x+=10;
					a[i][j][k]=(int)(Math.random() *100);
				}
			}
		}
		
		//output
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int k = 0; k < a[i][j].length; k++) {
					System.out.print(a[i][j][k] + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
