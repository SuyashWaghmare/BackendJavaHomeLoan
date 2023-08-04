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

public class SanctionLetter {

	@Id
	private int sid;
	private String sanctionDate;
	private int prospeotNo;
	private String applioantName;
	private long contactDetail;
	private String product;
	private Double loanAmtSantioned;
	private String interestType;
	private int rateOfInterest;
	private int loanTenure;
	private Double monthlyEmiAmount;
	private String modeOfPayment;
	private String remarks;
	private String termsCondition;
	private String status;

}
