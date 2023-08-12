package com.deltapro.loan.model;

import javax.persistence.CascadeType;
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
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmiDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int emiId;
	public double emiAmountMonthly;
	public String nextEmiDueDate;
	public String previousEmiStatus;

	@OneToOne(cascade = CascadeType.ALL)
	private LoanDetails loanDetails;

}
