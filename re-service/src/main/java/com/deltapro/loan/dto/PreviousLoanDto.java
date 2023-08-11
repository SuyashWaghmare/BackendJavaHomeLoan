package com.deltapro.loan.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PreviousLoanDto {

	//private int previousLoanId;
	private double previousLoanAmount;
	private int previousLoanTenure;
	private double previousLoanpaidAmount;
	private double previousLoanRemainingAmount;
	private int previousLoanDefaulterCount;
	private String status;

}
