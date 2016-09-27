package tables;

public class Partner {
/*
Partner:

Add partner profile ----- delete partner 
       |
Add partner products__ notify partners of sale __settle account
                                                       |

                                               generate report 
 */
	
	
	private int partnerID;
	private String partner_type;
	private String partner_name;
	private String product;
	
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	
	public String getPartner_name() {
		return partner_name;
	}
	public void setPartner_name(String partner_name) {
		this.partner_name = partner_name;
	}
	
	public String getPartner_type() {
		return partner_type;
	}
	public void setPartner_type(String partner_type) {
		this.partner_type = partner_type;
	}
	
	public int getPartnerID() {
		return partnerID;
	}
	public void setPartnerID(int partnerID) {
		this.partnerID = partnerID;
	}
}
