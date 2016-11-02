package services.partner;

import java.util.Set;

import services.representation.order.OrderRepresentation;
import services.representation.order.OrderRequest;

public class PartnerServices {
	
		public Set<OrderRepresentation> getOrders();
		public OrderRepresentation getOrders(String customerID);
		public OrderRepresentation createOrder(OrderRequest OrderRequest);
	

}
