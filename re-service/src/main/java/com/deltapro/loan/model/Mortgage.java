package com.deltapro.loan.model;

import javax.persistence.Entity;
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
public class Mortgage {
	@Id
	private int mid;
	private Double mPropertyValue;
	private byte[] mPropertyProof;
	private String mPropertyType;
	private Double mLoanOnProperty;
	private byte[] mPropertyInsurance;

}
