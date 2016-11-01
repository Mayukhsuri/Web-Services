package services.representation.customer;

public class CustomerRepresentation {
	private int customerID;
	private String lastName;
	private String firstName;
	
	public CustomerRepresentation()
	{
		
	}
	public int getcustomerID() {
		return customerID;
	}
	public void setcustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
	
}
