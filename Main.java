package Common;

import tables.Order;
import tables.Product;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebFunctions web = new WebFunctions();
		WebFunctions web1 = new WebFunctions();

		Order orderpass = web.orderaccept(1001);
		System.out.println("result is"+orderpass.getOrderquantity());
		Product productsearch = web1.search(1001);
		System.out.println("result is"+ productsearch.getProductdescription()+""+productsearch.getUnitprice());

		
		
	}

}
