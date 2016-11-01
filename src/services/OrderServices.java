package services;

import java.util.Set;

import services.representation.OrderRepresentation;
import services.representation.OrderRequest;



public interface OrderServices{
	public Set<OrderRepresentation> getOrders();
	public OrderRepresentation getOrders(String customerID);
	public OrderRepresentation createOrder(OrderRequest OrderRequest);
}
