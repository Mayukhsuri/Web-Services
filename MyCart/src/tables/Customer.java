package tables;

public class Customer {
	/*
Custormer:
          phone
            |
Oreder__ customer ___ customer details
            |
         address

	 */
	private int customerID;
	private String customer_adderss;
	private int phone_cust;
	//private int order_type;
	
	public int getPhone_cust() {
		return phone_cust;
	}
	public void setPhone_cust(int phone_cust) {
		this.phone_cust = phone_cust;
	}
	
	public String getCustomer_adderss() {
		return customer_adderss;
	}
	public void setCustomer_adderss(String customer_adderss) {
		this.customer_adderss = customer_adderss;
	}
	
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	 
}
