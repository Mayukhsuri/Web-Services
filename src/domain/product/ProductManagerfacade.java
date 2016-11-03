package domain.product;

import dbconn.*;
import domain.*;
import domain.product.Product;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class ProductManagerfacade extends dbConnection{
	public Product serachProduct(int productID)
	{

		dbConnection connect = new dbConnection();
		Product product = connect.searchProduct(productID);
		return product;

	}
	public String addProduct(String productDescription, double unitPrice, int availableQuantity)
	{
	
		Product product = new Product();
		product.setProductDescription(productDescription);
		product.setUnitPrice(unitPrice);
		String status = dbConnection.addProduct(product);
		return status;
	}
}