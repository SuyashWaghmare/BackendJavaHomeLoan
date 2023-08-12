package com.deltapro.loan.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {

	// private int customerId;

	private String customerName;

	private String customerBirthDate;

	private int customerAge;

	private String customerGender;

	private String customerEmail;

	private long customerMobileNo;

	private String panNo;

	private long aadhaarCard;

	private long customerAmountPaidforHome;

	private long customerTotalLoanRequired;

	private AccountDetailsDto accountDetails;

	private CustomerPermanentAddressDto customerPermanentAddress;

	private CustomerLocalAddressDto customerLocalAddress;

	private DependentInfoDto dependentInfo;

	private GuarantorDetailsDto guarantorDetails;

	private List<MortgageDto> mortgageDetails;

	private List<PreviousLoanDto> previousLoan;

	private ProfessionDto profession;

	private List<PropertyInfoDto> propertyInfo;

}
