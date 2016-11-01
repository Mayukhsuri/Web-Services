package services;

import java.util.Set;

import services.representation.CustomerRepresentation;
import services.representation.CustomerRequest;



public interface Customerservices {
	public Set<CustomerRepresentation> getCustomers();
	public CustomerRepresentation getCustomer(String customerID);
	public CustomerRepresentation createCustomer(CustomerRequest customerRequest);
}
