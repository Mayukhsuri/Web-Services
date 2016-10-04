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
	
	public Customer addCustomer()
	{
		DataBaseConnector connect3 = new DataBaseConnector();
		
Customer cu = new Customer();
connect3.addcustomer(cu);
System.out.println("Input name of the customer");
Scanner scan = new Scanner(System.in);
Integer customerID = scan.nextInt();
cu.setCustomerID(customerID);
System.out.println("Input address of cutomer");
//Scanner scan = new Scanner(System.in);
String caddress = scan.nextLine();
cu.setCustomer_adderss(caddress);

System.out.println("Input phone of cutomer");
//Scanner scan = new Scanner(System.in);
Integer cphone = scan.nextInt();
cu.setPhone_cust(cphone);

return cu;

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
