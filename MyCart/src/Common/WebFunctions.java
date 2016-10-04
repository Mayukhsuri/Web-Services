package Common;

import java.sql.Connection;

import com.sun.org.apache.xpath.internal.operations.Bool;

import tables.Order;
import tables.Payment;
import tables.Product;


public class WebFunctions{


	public Product search(int ProductID)
	{
		
		DataBaseConnector connect = new DataBaseConnector();
		Product product = connect.search(ProductID);
		return product;

		
	}
	public Order orderaccept(int orderquantity)
	{
		DataBaseConnector connect1 = new DataBaseConnector();
		Order orderrr = connect1.orderaccept(orderquantity);
		return orderrr; 
		
	}
	public void Creditcard (Payment payaccept )
	{
		long Cardno =payaccept.cardno;
		int cvv = payaccept.cvv;
		if (String.valueOf(Cardno).length()<=15)
		{
			
			System.out.print("Payment accepted");
		}
		if (String.valueOf(Cardno).length()>15)
		{
			System.out.print("Payment cannot be accepted");
		}
	}
	public void OrderStatus(Boolean orderstatus)
	{
		if(orderstatus= true)
		{
			
		}
		if(orderstatus= false)
		{
			
		}

	}
	
}
