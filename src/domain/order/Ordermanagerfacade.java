package domain.order;
import dbconn.*;
import domain.order.*;
import domain.product.Product;

import java.util.Map;


public class Ordermanagerfacade extends OrderDb{

	public void ordermanage(Map<Product,Integer> product, String orderdesp, int orderquant)
	{
		Order o = new Order();
		String status=null;
		Orderstatus os = new Orderstatus(status);
		OrderDb oconn = new OrderDb();

		orderdesp ="book";
		orderquant = 2;		
		Product p = new Product(1002, "book", 300);
		product.put(p, 3);
		o.setOrderID(123);
//		o.setCustomer(customer);
		o.setTotalPrice(300);
		os.setOrderStatus("dispatch");
		oconn.orderaccept(o, product);
	}
}