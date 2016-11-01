package services.customer;

import java.util.Set;

import services.representation.customer.CustomerRepresentation;
import services.representation.customer.CustomerRequest;



public interface Customerservices {
	public Set<CustomerRepresentation> getCustomers();
	public CustomerRepresentation getCustomer(String customerID);
	public CustomerRepresentation createCustomer(CustomerRequest customerRequest);
}
