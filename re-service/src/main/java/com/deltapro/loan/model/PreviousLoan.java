package com.deltapro.loan.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class PreviousLoan {
	@Id
	private int ploanid;
	private double ploanAmount;
	private int pTenure;
	private double paidAmount;
	private double remainingAmount;
	private int defaulterCount;
	@OneToMany
	private PreviousLoanBank pBankDetails;
	private String status;
	private String remark;

}
