package domain.services.workflow;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


import domain.customer.Customer;
import domain.customer.Customermanagerfacade;
import domain.services.Customerservices;
import domain.services.representation.*;

public class CustomerActivity  {

private static Customermanagerfacade em = new Customermanagerfacade();
	
	public Set<Customermanagerfacade> getCustomers() {
		
		Set<Customer> customers = new HashSet<Customer>();
		Set<CustomerRepresentation> customerRepresentations = new HashSet<CustomerRepresentation>();
		//employees = dao.getAllEmployees();
		customers = em.getAllCustomers();
		
		Iterator<Customer> it = employees.iterator();
		while(it.hasNext()) {
			Customer emp = (Customer)it.next();
			CustomerRepresentation customerRepresentation = new CustomerRepresentation();
			customerRepresentation.setcustomerID(emp.getCustomerID());
			customerRepresentation.setFirstName(emp.getFirstName());
			customerRepresentation.setLastName(emp.getLastName());
          
          //now add this representation in the list
			customerRepresentations.add(customerRepresentation);
        }
		return customerRepresentations;
	}
	
	public CustomerRepresentation getCustomer(String id) {
		
		//Employee emp = dao.getEmployee(id);
		Customer emp = em.getcustomers(id); 
		
		CustomerRepresentation empRep = new CustomerRepresentation();
		empRep.setFirstName(emp.getFirstName());
		empRep.setLastName(emp.getLastName());
		empRep.setcustomerID(emp.getCustomerID());
		
		return empRep;
	}
	
	public CustomerRepresentation createEmployee(String firstName, String lastName) {
		
		//Employee emp = dao.addEmployee(firstName, lastName);
		Customer emp = em.addCustomer(firstName, lastName);
		
		CustomerRepresentation empRep = new CustomerRepresentation();
		empRep.setFirstName(emp.getFirstName());
		empRep.setLastName(emp.getLastName());
		empRep.setcustomerID(emp.getCustomerID());
		
		return empRep;
	}
	
	public String deleteEmployee(String id) {
		
		//dao.deleteEmployee(id);
		//em.deleteEmployee(id);
		
		return "OK";
	}
	

}
