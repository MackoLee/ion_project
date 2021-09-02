package Quiz;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Customers{
	private Set<Customer> customers= new HashSet<Customer>();
	private int id=1;
	public Boolean add() {
		return customers.add(new Customer(hashCode(),id++)); //성공하면 true, 실패하면 false
	}
	public Boolean edit(){
		System.out.print("수정하고싶은 id 를 입력하세요 : ");
		Scanner input = new Scanner(System.in);
		int id = new Integer(input.next()); //글자가 들어와도 오류 발생해서 homework1 main에서 try로 받음.
		if(!customers.remove(new Customer(hashCode(),id,null))) return false; //삭제가 안되면 없는 값이므로 실행 x
		return customers.add(new Customer(hashCode(),id));
	}
	public Boolean remove() {
		System.out.print("삭제하고싶은 id 를 입력하세요 : ");
		Scanner input = new Scanner(System.in);
		int id = new Integer(input.next()); //글자가 들어와도 오류 발생해서 homework1 main에서 try로 받음.
		return customers.remove(new Customer(hashCode(),id,null)); //성공하면 true, 실패하면 false
	}
	@Override
	public String toString() {
		return customers.toString();
	}
}


class Customer {
	private int hashStart;
	private int id;
	private String name, address, tel;
	public Customer(int hashStart, int id) {
		Scanner input = new Scanner(System.in);
		this.hashStart=hashStart;
		this.id = id;
		System.out.print("이름을 입력해주세요 : ");
		name = input.next();
		
		input = new Scanner(System.in); //버퍼 초기화, 안하면 주소추가가 안됨.
		System.out.print("주소를 입력해주세요 : ");
		address = input.nextLine();
		System.out.print("전화번호를 입력해주세요 : ");
		tel = input.next();
	}
	public Customer(int hashStart, int id, String find) {
		this.hashStart=hashStart;
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public void setHashStart(int hashStart) {
		this.hashStart=hashStart;
	}
	@Override
	public int hashCode() {
		return hashStart+id;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Customer) {
			Customer cus = (Customer)obj;
			return id==cus.getId();
		}
		return false;
	}
	@Override
	public String toString() {
		return "[ 고객id : " + id + ", 고객명 : " + name + ", 주소 : " + address + ", 연락처 : " + tel + " ]\n";
	}
}

