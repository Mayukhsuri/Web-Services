package services.representation.partner;

import domain.product.Product;

public class PartnerRequest {
	private int partnerID;
	private String partnerType;
	private String partnerName;
	private Product product;
	public int getPartnerID() {
		return partnerID;
	}
	public void setPartnerID(int partnerID) {
		this.partnerID = partnerID;
	}
	public String getPartnerType() {
		return partnerType;
	}
	public void setPartnerType(String partnerType) {
		this.partnerType = partnerType;
	}
	public String getPartnerName() {
		return partnerName;
	}
	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	
}
