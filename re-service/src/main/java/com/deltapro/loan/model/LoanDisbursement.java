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
public class LoanDisbursement {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int loanDisbursementAgreementId;
	private int loanNo;
	private String agreementDate;
	private String amountPayType;
	private double totalAmount;
	private String bankName;
	private long accountNumber;
	private String ifscCode;
	private String accountType;
	private double transferAmount;
	private String paymentStatus;
	private String amountPaidDate;

}
