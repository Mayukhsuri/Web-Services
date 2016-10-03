package tables;

public class Orderstatus {
	private Order orderID;
	public String shipped;
	public String delivered;

	public Orderstatus(Order orderID, String shipped, String delivered)
	{
		this.orderID=orderID;
		this.shipped=shipped;
		this.delivered=delivered;
	}
	
	
}
