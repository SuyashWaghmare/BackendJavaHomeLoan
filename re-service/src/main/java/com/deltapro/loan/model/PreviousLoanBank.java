package com.deltapro.loan.model;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PreviousLoanBank {

	private String bankName;
	private String branchName;
	private String branchCode;
	@Id
	private int branchID;
	private String branchType;
	private String IFSCCode;
	private String MICRCode;
	private long contactNo;
	@OneToOne(cascade = CascadeType.ALL)
	private BankAddress bankAddress;
	private String Email;
	private String status;
	
}

