package services.product;


import java.util.Set;

import services.representation.customer.CustomerRepresentation;
import services.representation.customer.CustomerRequest;
import services.representation.product.ProductRepresentation;
import services.representation.partner.PartnerRepresentation;
import services.workflow.customer.CustomerActivity;
import services.workflow.product.ProductActivity;

public class ProductResource {
	public Set<ProductRepresentation> getCustomer() {
		System.out.println("GET METHOD Request for all Products .............");
		ProductActivity custActivity = new ProductActivity();
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
