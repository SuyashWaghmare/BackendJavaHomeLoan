package com.deltapro.loan.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PropertyInfoDto {

	//private int propertyId;
	private String propertytype;
	private String propertyArea;
	private String propertyconstructionArea;
	private double propertyPrice;
	private double propertyconstructionPrice;

}
