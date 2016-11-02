package services.order;

import java.util.Set;

import services.representation.customer.CustomerRepresentation;
import services.representation.customer.CustomerRequest;
import services.representation.order.OrderRepresentation;
import services.representation.partner.PartnerRepresentation;
import services.workflow.customer.CustomerActivity;
import services.workflow.order.OrderActivity;

public class OrderResource {
	public Set<OrderRepresentation> getCustomer() {
		System.out.println("GET METHOD Request for all customers .............");
		OrderActivity custActivity = new OrderActivity();
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
