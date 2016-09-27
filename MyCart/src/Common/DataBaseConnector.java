package Common;

//import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import tables.Product;

public class DataBaseConnector {
	/*
	 Search ___ availabelity __ buy___ create order___ fullfill order___ ship order ---->____provide status                               
    Product                      |          \                 |          /
                             payment       cancel order --->  return (return)          
                                                                                      
              

	 */
	private String address = "Mayukh";

	private String MYSQL_username = "Mayukh";
	private String MYSQL_password = "mayukh";
	
	private Statement statement = null;
	public Product search(int productID) {
	
		Product product = new Product();
		
	
	
	try {
		Class.forName("").newInstance();
		
	
		Connection connection = DriverManager.getConnection(MYSQL_password, MYSQL_username,address);
		statement = connection.createStatement();
		ResultSet result = null;
		String query ="Select * from product";
		result = statement.executeQuery(query);
		if(result!=null)
		{
			System.out.println("processing ..");
			result.next();
			product.setProductID(result.getInt("ProductID"));
			product.setProductdescription(result.getString("productDescription"));
			product.setUnitprice(result.getInt("unitprice"));
		}
	} catch (SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException ex) {
		
	    // handle any errors
	    System.out.println("SQLException: " + ex.getMessage());
	    System.out.println("SQLState: " + ((SQLException) ex).getSQLState());
	    System.out.println("VendorError: " + ((SQLException) ex).getErrorCode());
	}
	return product;
	}
}


