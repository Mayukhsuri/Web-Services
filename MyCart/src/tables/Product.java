package tables;

public class Product {
/*
Models:

Products ___ product detail
   |
Product owner 
*/
	
private int productID;
private String productdescription;
private int unitprice;
public int getProductID() {
	return productID;
}
public void setProductID(int productID) {
	this.productID = productID;
}
public int getUnitprice() {
	return unitprice;
}
public void setUnitprice(int unitprice) {
	this.unitprice = unitprice;
}
public String getProductdescription() {
	return productdescription;
}
public void setProductdescription(String productdescription) {
	this.productdescription = productdescription;
}
}
