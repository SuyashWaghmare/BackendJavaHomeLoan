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
public class SanctionLetter {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sanctionLetterId;
	private String sanctionLetterDate;
	private String applicantName;
	private long contactDetail;
	private String product;
	private Double loanAmountSantioned;
	private String interestType;
	private int rateOfInterest;
	private int loanTenure;
	private Double monthlyEmiAmount;
	private String string;
	private String status;

}
