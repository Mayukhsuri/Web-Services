package tables;

public class Payment {
public Customer customerID;
public long cardno;
public int cvv;
public String type;

public Payment(Customer customerID,long cardno,int cvv,String type)
{
	this.customerID=customerID;
	this.cardno = cardno;
	this.cvv=cvv;
	this.type=type;
}
	
	
}


