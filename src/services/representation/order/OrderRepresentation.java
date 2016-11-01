package services.representation.order;

    public class OrderRepresentation {
	private int orderID;
	private String lastName;
	private String firstName;
	
	public int getorderID() {
		return orderID;
	}
	public void setorderID(int orderID) {
		this.orderID = orderID;
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
