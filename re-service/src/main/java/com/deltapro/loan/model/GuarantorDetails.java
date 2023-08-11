package com.deltapro.loan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GuarantorDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int guarantorDetailsId;
	private String guarantorName;
	private String guarantorDateOfBirth;
	private String guarantorRelationshipwithCustomer;
	private long guarantorMobileNo;
	private long guarantorAdharCardNo;

}
