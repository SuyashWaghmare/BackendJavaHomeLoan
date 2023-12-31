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
public class Ledger {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ledgerId;
	private String ledgerCreatedDate;
	private Double totallLoanAmount;
	private Double pyableAmountwithInterest;
	private int tenure;
	private Double monthlyEMI;
	private Double amountpaidtillDate;
	private Double remainingAmmount;
	private String nextEmiDatestart;
	private String nextEmiDateEnd;
	private int defaulterCount;
	private String previousEmiStatus;
	private String currentMonthEmiStatus;
	private String loanEndDate;
	private String loanStatus;

}
