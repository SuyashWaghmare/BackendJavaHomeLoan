package com.deltapro.loan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int loanId;
	private int loanNo;
	private Double loanAmount;
	private int rateOfInterest;
	private int tenure;
	private Double totalAmountToBePaid;
	private int processingFees;
	private Double totalInterest;
	private String sanctionDate;
	private String status;

	@OneToOne // (mappedBy = "loanDetails", cascade = CascadeType.ALL)
	private EmiDetails emiDetails;

}
