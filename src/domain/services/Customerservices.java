package domain.services;

import java.util.Set;

import domain.services.representation.CustomerRepresentation;
import domain.services.representation.CustomerRequest;


public interface Customerservices {
	public Set<CustomerRepresentation> getCustomers();
	public CustomerRepresentation getCustomer(String customerID);
	public CustomerRepresentation createCustomer(CustomerRequest customerRequest);
}
