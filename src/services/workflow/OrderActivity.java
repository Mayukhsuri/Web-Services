package services.workflow;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import services.OrderServices;;
import services.representation.*;


import domain.order.Order;
import domain.order.Ordermanagerfacade;

public class OrderActivity  {

private static Ordermanagerfacade em = new Ordermanagerfacade();
	
	public Set<Ordermanagerfacade> getCustomers() {
		
		Set<Order> order = new HashSet<Order>();
		Set<OrderRepresentation> orderRepresentation = new HashSet<OrderRepresentation>();
		//employees = dao.getAllEmployees();
		order = em.getAllOrders();
		
		Iterator<Order> it = order.iterator();
		while(it.hasNext()) {
			Order emp = (Order)it.next();
			OrderRepresentation orderRepresentations= new OrderRepresentation();
			orderRepresentations.setOrderID(emp.getOrderID());
			orderRepresentations.setFirstName(emp.getFirstName());
			orderRepresentations.setLastName(emp.getLastName());
          
          //now add this representation in the list
			orderRepresentations.add(orderRepresentations);
        }
		return orderRepresentation;
	}
	
	public OrderRepresentation getOrder(String id) {
		
		//Employee emp = dao.getEmployee(id);
		Order ord = em.getOrder(id); 
		
		OrderRepresentation ordRep = new OrderRepresentation();
		ordRep.setFirstName(ord.getFirstName());
		ordRep.setLastName(ord.getLastName());
		ordRep.setOrderID(ord.getOrderID());
		
		return empRep;
	}
	
	public OrderRepresentation createEmployee(String firstName, String lastName) {
		
		//Employee emp = dao.addEmployee(firstName, lastName);
		Order emp = em.addOrder(firstName, lastName);
		
		OrderRepresentation ordRep = new OrderRepresentation();
		ordRep.setFirstName(emp.getFirstName());
		ordRep.setLastName(emp.getLastName());
		ordRep.setorderID(emp.getOrderID());
		
		return ordRep;
	}
	
	public String deleteEmployee(String id) {
		
		//dao.deleteOrder(id);
		//em.deleteOrder(id);
		
		return "OK";
	}
	

}
