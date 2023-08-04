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

public class BankDetails {
	private String branchname;
	private long branchcode;
	@Id
	private int branchid;
	private String branchtype;
	private String ifscCode;
	private String micrCode;
	private long contactNO;
	@OneToOne
	private BankAddress branchAddress;
	private String email;
	private String status;

}
