package services.representation.product;

public class ProductRepresentation {

private int ProductID;
private String productDescription;
private double unitPrice;


public int getProductID() {
	return ProductID;
}


public void setProductID(int productID) {
	ProductID = productID;
}


public String getProductDescription() {
	return productDescription;
}


public void setProductDescription(String productDescription) {
	this.productDescription = productDescription;
}


public double getUnitPrice() {
	return unitPrice;
}


public void setUnitPrice(double unitPrice) {
	this.unitPrice = unitPrice;
}

}
