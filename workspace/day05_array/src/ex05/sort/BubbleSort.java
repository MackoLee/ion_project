package ex05.sort;

public class BubbleSort {
	public static void main(String[] args) {
		int[] a = {7,3,5,2,8};
		int temp;

		System.out.println("******* 소트 전 출력 : ");
		for(int i=0;i<a.length;i++) {
		  System.out.print(a[i] + "\t");
		}
		Boolean flag=true;
		while(flag) {
			for(int i=1;i<a.length;i++) {
				if(a[i-1]>a[i]) {
					temp=a[i-1];
					a[i-1]=a[i];
					a[i]=temp;
					flag=true;
				}
			}
		}
		
		System.out.println("\n******* 소트 후 출력 : ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] + "\t");
		}
	}

}
