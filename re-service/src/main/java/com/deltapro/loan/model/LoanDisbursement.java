package com.deltapro.loan.model;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Builder
public class LoanDisbursement {
	private int agreementid;
	private int loanNo;
	private String agrrementDate;
	private String amountPayType;
	private double totalAmount;
	private String bankName;
	private long accountNumber;
	private String IFSCCode;
	private String accountType;
	private double transferAmount;
	private String paymentStatus;
	private String amountPaidDate;
	
	
	
	

}
