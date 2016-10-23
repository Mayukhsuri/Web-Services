package domain.customer;
import java.util.Scanner;


import dbconn.CustomerDb;
import dbconn.dbConnection;
import domain.order.Order;


public class Customermanagerfacade extends CustomerDb{
	
	private static Scanner sc = new Scanner(System.in);
	public void addCustomer() {
		
		//int customerID=0;
		Address customerAddress= null;
		//int customerPhone=0;
		//Order order = new Order();
		CustomerDb conn = new CustomerDb();	
		
		Customer c = new Customer();
			
		System.out.println("please enter customerID: ");
		int customerID=sc.nextInt();
		c.setCustomerID(customerID);
		
		System.out.println("please enter customer phone: ");
		int customerPhone=sc.nextInt();
		c.setCustomerPhone(customerPhone);

		Address a = new Address();
		System.out.println("Please enter the house number: ");
		String HouseNumber = sc.nextLine();
		a.setHouseNumber(HouseNumber);

		System.out.println("Please enter the street: ");
		String street= sc.nextLine();
		a.setStreet(street);
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Please enter your state: ");
		String state = sc2.nextLine();
		a.setState(state);
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Please enter the zipcode: ");
		int zip= sc3.nextInt();
		a.setZip(zip);
		
	conn.customerinsert(c)	;
	
	}
}
