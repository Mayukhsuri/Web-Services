package services.partner;

import java.util.Set;

import services.representation.customer.CustomerRepresentation;
import services.representation.customer.CustomerRequest;
import services.representation.partner.PartnerRepresentation;
import services.representation.partner.PartnerRequest;
import services.workflow.customer.CustomerActivity;
import services.workflow.partner.PartnerActivity;

public class PartnerResource {
	public Set<PartnerRepresentation> getPartner() {
		System.out.println("GET METHOD Request for all Partners .............");
		PartnerActivity custActivity = new PartnerActivity();
		return custActivity.getPartner();	
	}
	
	public PartnerRepresentation getPartners(String id) {
		System.out.println("GET METHOD Request from Client with customerrequest string ............." + id);
		PartnerActivity custActivity = new PartnerActivity();
		return custActivity.getPartners(id);
	}
	
	public PartnerRepresentation createPartner(PartnerRequest  partnerRequest) {
		System.out.println("POST METHOD Request from Client with ............." + partnerRequest.getPartnerName() + "  " );
		CustomerActivity empActivity = new CustomerActivity();
		return empActivity.createPartner(partnerRequest.getPartnerName(), partnerRequest.getLastName());
	}	
}
