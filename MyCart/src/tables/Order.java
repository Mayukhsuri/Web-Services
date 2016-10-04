package tables;

public class Order {
/*
Order:
                   customer
                         |
payment___Order ____order detail____ product
                         |
                     status
*/
	private int OrderID;
	private boolean orderstatus;
	private String orderdate;
	private String product;
	private String orderquantity;
	private int price;
	public int getOrderID() {
		return OrderID;
	}
	public void setOrderID(int orderID) {
		OrderID = orderID;
	}
	public String getOrderstatus() {
		return orderstatus;
	}
	public void setOrderstatus(String orderstatus) {
		this.orderstatus = orderstatus;
	}
	public String getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(String orderdate) {
		this.orderdate = orderdate;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getOrderquantity() {
		return orderquantity;
	}
	public void setOrderquantity(String orderquantity) {
		this.orderquantity = orderquantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
