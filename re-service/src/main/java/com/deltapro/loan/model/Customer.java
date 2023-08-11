package com.deltapro.loan.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;
	private String customerName;
	private String customerBirthDate;
	private int customerAge;
	private String customerGender;
	private String customerEmail;
	private long customerMobileNo;
	private long customerAdditionalMobileNo;
	private long customerAmountPaidforHome;
	private long customerTotalLoanRequired;

	@OneToOne(cascade = CascadeType.ALL)
	private AccountDetails accountDetails;

	@OneToOne(cascade = CascadeType.ALL)
	private Cibil cibil;

	@OneToOne(cascade = CascadeType.ALL)
	private CustomerPermanentAddress customerPermanentAddress;

	@OneToOne(cascade = CascadeType.ALL)
	private CustomerLocalAddress customerLocalAddress;

	@OneToOne(cascade = CascadeType.ALL)
	private CustomerVerification verification;

	@OneToOne(cascade = CascadeType.ALL)
	private DependentInfo dependentInfo;

	@OneToOne(cascade = CascadeType.ALL)
	private Documents documents;

	@OneToOne(cascade = CascadeType.ALL)
	private GuarantorDetails guarantorDetails;

	@OneToOne(cascade = CascadeType.ALL)
	private Ledger ledger;

	@OneToOne(cascade = CascadeType.ALL)
	private LoanDetails loanDetails;

	@OneToOne(cascade = CascadeType.ALL)
	private LoanDisbursement loanDisbursement;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Mortgage> mortgageDetails;

	@OneToMany(cascade = CascadeType.ALL)
	private List<PreviousLoan> previousLoan;

	@OneToOne(cascade = CascadeType.ALL)
	private Profession profession;

	@OneToMany(cascade = CascadeType.ALL)
	private List<PropertyInfo> propertyInfo;

	@OneToOne(cascade = CascadeType.ALL)
	private SanctionLetter sanctionLetter;

}
