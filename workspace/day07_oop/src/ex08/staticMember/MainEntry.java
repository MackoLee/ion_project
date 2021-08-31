package ex08.staticMember;

class Atm{
	int count; //instance member
	static int total; // static member
	
	public Atm(int amount) { // constructor method
		count+=amount;
		total+=amount;
	}
	
	public void display() {
		System.out.println("count = " + count);
		System.out.println("total = " + total);
	}
}

public class MainEntry {
	public static void main(String[] args) {
		System.out.println(Atm.total);
		Atm at = new Atm(1000);
		at.display(); // c:1000 t:1000
		System.out.println("-----------------");
		Atm at2 = new Atm(1000);
		at2.display();
		Atm.total+=1000;
		at2.display();
	}
}
