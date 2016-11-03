package services.representation.order;

import domain.order.Orderstatus;
import domain.product.Product;

public class OrderRequest  {
	private Orderstatus orderStatus;
	public Orderstatus getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(Orderstatus orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getOrderQuantity() {
		return orderQuantity;
	}
	public void setOrderQuantity(String orderQuantity) {
		this.orderQuantity = orderQuantity;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	private String orderDate;
	private String orderQuantity;
	private double totalPrice;
	private Product product;
	
	
	
	
	
	
	
}
