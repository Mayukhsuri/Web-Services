package services;

import java.util.Set;

import services.representation.*;
import services.workflow.*;





public class CustomerResource  {
  
	public Set<CustomerRepresentation> getCustomer() {
		System.out.println("GET METHOD Request for all customers .............");
		CustomerActivity custActivity = new CustomerActivity();
		return custActivity.getCustomer();	
	}
	
	public CustomerRepresentation getCustomer(String id) {
		System.out.println("GET METHOD Request from Client with customerrequest string ............." + id);
		CustomerActivity custActivity = new CustomerActivity();
		return custActivity.getCustomer(id);
	}
	
	public CustomerRepresentation createEmployee(CustomerRequest  employeeRequest) {
		System.out.println("POST METHOD Request from Client with ............." + employeeRequest.getFirstName() + "  " + employeeRequest.getLastName());
		CustomerActivity empActivity = new CustomerActivity();
		return empActivity.createEmployee(employeeRequest.getFirstName(), employeeRequest.getLastName());
	}	
  }
