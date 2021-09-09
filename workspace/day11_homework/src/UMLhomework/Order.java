package UMLhomework;

import java.util.ArrayList;
import java.util.Date;

public class Order {
	private int oid;
	private Date orderDate;
	public ArrayList<Customer> customers;
	public Order(int oid, Date orderDate) {
		this.oid=oid;
		this.orderDate=orderDate;
	}
	public Order(int oid) {
		this(oid, new Date());
	}
	
	private Date getOrderDate() {
		return orderDate;
	}
	
}
