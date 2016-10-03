package Common;

import tables.Order;
import tables.Product;

public class WebFunctions{

	
	public Product findproduct(int ProductID)
	{
		
		DataBaseConnector connect = new DataBaseConnector();
		Product product = connect.search(ProductID);
		return product;

		
	}
	public Order accprder(int orderquantity)
	{
		DataBaseConnector connect1 = new DataBaseConnector();
		Order orderrr = connect1.orderaccept(orderquantity);
		return orderrr; 
		
	}
	
}
