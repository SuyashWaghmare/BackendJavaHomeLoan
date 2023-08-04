package com.deltapro.loan.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoanDetails {
	@Id
	private int loanId;
	private int loanNo;

	@OneToOne
	private EmiDetails emiDetails;

	private Double loanAmount;
	private int rateOfInterest;
	private int tenure;
	private Double totalAmountToBePaid;
	private int processingFees;
	private Double totalInterest;
	private String sanctionDate;
	private String remark;
	private String status;

}
