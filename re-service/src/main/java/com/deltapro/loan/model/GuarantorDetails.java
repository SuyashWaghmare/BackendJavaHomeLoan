package com.deltapro.loan.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Builder

public class GuarantorDetails {

	@Id
	private int gid;
	private String gName;
	private String gDateofBirth;
	private String gRelationshipwithCustomer;
	private long gMobNo;
	private long gAdharCardNo;
	private String gMortgageDetails;
	private String gJobDetails;
	private String gLocalAddress;
	private String gPermanentAddress;  
	
	
	
}
