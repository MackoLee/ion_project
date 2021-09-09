package UMLhomework;

public class SpecialCustomer extends Customer{
	private int sid;
	
	public SpecialCustomer(int sid, int cid, String name, String address, String phone) {
		super(cid, name, address, phone);
		this.sid=sid;
	}
}
