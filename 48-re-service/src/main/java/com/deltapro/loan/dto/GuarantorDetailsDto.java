package com.deltapro.loan.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GuarantorDetailsDto {

	//private int guarantorDetailsId;
	private String guarantorName;
	private String guarantorDateOfBirth;
	private String guarantorRelationshipwithCustomer;
	private long guarantorMobileNo;
	private long guarantorAdharCardNo;

}
