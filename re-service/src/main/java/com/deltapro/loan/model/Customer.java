package com.deltapro.loan.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Builder
public class Customer {
	@Id
	private int eID;
	private String name;
	private String DOB;
	private int age;
	private String Gender;
	private String Email;
	private long MobileNo;
	private long cAdditionalMobileNo;
	private long cAmountPaidforHome;
	private long cTotalLoanRequired;
	@OneToMany
	private EducationalInfo cEducationalInfo;
	@OneToOne
	private AllPersonalDocs cAllPersonalDocs;
	@OneToMany
	private DependentInfo cDependentInfo;
	@OneToOne
	private CustomerAddress cAddress;
	@OneToOne
	private Mortgage cMortgageDetails;
	@OneToOne
	private Profession cProfession;
	@OneToOne
	private Cibil ccibil;
	@OneToOne
	private LoanDetails cLoanDetails;
	@OneToMany
	private PreviousLoan cPreviousLoan;
	@OneToOne
	private AccountDetails cAccountDetails;
	@OneToOne
	private PropertyInfo cPropertyInfo;
	@OneToMany
	private GuarantorDetails cGuarantorDetails;
	@OneToOne
	private LoanDisbursement cLoanDisbursement;
	@OneToOne
	private Ledger cledger;
	@OneToOne
	private SanctionLetter cSanctionLette;
	@OneToOne
	private CustomerVerification cverification;

}
