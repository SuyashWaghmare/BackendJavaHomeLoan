package com.deltapro.loan.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
public class Admin {

	@Id
	private int bankId;

	private String bankName;

	@OneToOne
	private BankDetails bankDetails;

	@OneToMany
	private EnquiryDetails enquiryDetails;

	@OneToMany
	private Employee employeeDetails;

	@OneToMany
	private Customer customerDetails;

}
