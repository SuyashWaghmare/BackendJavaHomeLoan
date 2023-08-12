package com.deltapro.loan.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MortgageDto {

	//private int mortgageId;
	private Double mortgagePropertyValue;
	private String mortgagePropertyType;
	private Double mortgageLoanOnProperty;

}
