package Common;

import Common.WebFunctions;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import tables.Order;
import tables.Product;

public class DataBaseConnector {
	/*
	 Search ___ availabelity __ buy___ create order___ fullfill order___ ship order ---->____provide status                               
    Product                      |          \                 |          /
                             payment       cancel order --->  return (return)          
                                                                                      
              

	 */
	private String address = "jdbc:mysql://localhost:3307/mycart";

	private String MYSQL_username = "root";
	private String MYSQL_password = "Mayukh123";
	
	private Statement statement = null;
	
	public Void addcustomer(Customer customer)

	{

	Customer custom = new Customer();

	try{

	Class.forName("com.mysql.jdbc.Driver").newInstance();

	Connection connection = DriverManager.getConnection(MYSQL_password, MYSQL_username,address);

	statement = connection.createStatement();

	ResultSet resultset3 = null;

	String sql3 = "INSERT INTO Customer " +

	                   "VALUES (1002, 'Shefali', 746767647) ;";

	resultset3 = statement.executeQuery(sql3);



	System.out.println("Inserted records into the table...");

	}

	catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException ex) {



	   // handle any errors

	   //System.out.println("SQLException: " + ex.getMessage());

	   //System.out.println("SQLState: " + ((SQLException) ex).getSQLState());

	  // System.out.println("VendorError: " + ((SQLException) ex).getErrorCode());

	}
	return null;


	}
	public Order orderaccept(int orderquantity)
	{
		Order acceptobj = new Order();
		try{
			Class.forName("").newInstance();
			Connection connection = DriverManager.getConnection(MYSQL_password, MYSQL_username,address);
			statement = connection.createStatement();
			ResultSet resultset2 = null;
			String sql2 = "Select from order WHERE Orderquantity =2 ;";
			resultset2 = statement.executeQuery(sql2);
			
			if(orderquantity<1)
			{
				System.out.println("Order cannot be placed.");
				resultset2.next();
			}
			else
			{
				System.out.println("Your order is placed.");

			}
		}
			catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException ex) {
				
			    // handle any errors
			    //System.out.println("SQLException: " + ex.getMessage());
			    //System.out.println("SQLState: " + ((SQLException) ex).getSQLState());
			   // System.out.println("VendorError: " + ((SQLException) ex).getErrorCode());
			}
		return acceptobj;
		}
	
	public Product search(int product_ID) {
	
		Product product = new Product(1001); 
	try {
		Class.forName("").newInstance();
		
	
		Connection connection = DriverManager.getConnection(MYSQL_password, MYSQL_username,address);
		statement = connection.createStatement();
		ResultSet resultset1 = null;
		String sql ="Select * from product WHERE product_ID=1001";
		resultset1 = statement.executeQuery(sql);
		
		if(resultset1!=null)
		{
			System.out.println("processing ..");
			resultset1.next();
			product.setProductID(resultset1.getInt("ProductID"));
			product.setProductdescription(resultset1.getString("productDescription"));
			product.setUnitprice(resultset1.getInt("unitprice"));
		}

		
	/*	if(resultset1!= null)
		{
			System.out.println("processing ..");
			product.setproduct_ID(resultset1.getInt("product_ID"));
			product.setProduct_description(resultset1.getString("product_description"));
			product.setUnit_price(resultset1.getInt("unit_price"));
		}
		*/
		;
		
		
	} catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException ex) {
		
	    // handle any errors
	    //System.out.println("SQLException: " + ex.getMessage());
	    //System.out.println("SQLState: " + ((SQLException) ex).getSQLState());
	    //System.out.println("VendorError: " + ((SQLException) ex).getErrorCode());
	}
	return product;
	}
	
	
}


