package domain.customer;

import domain.order.*;


public class Customer {
	
	private int customerID;
	private Address customerAddress;
	private int customerPhone;
	private Order order;
	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public Address getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}

	public int getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(int customerPhone) {
		this.customerPhone = customerPhone;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	public Customer() {
		super();
		this.customerID = customerID;
		this.customerAddress = customerAddress;
		this.customerPhone = customerPhone;
		}
	public Customer(int customerID, Address customerAddress, int customerPhone) {
		super();
		this.customerID = customerID;
		this.customerAddress = customerAddress;
		this.customerPhone = customerPhone;
		//this.order = order;
	}


	
}
