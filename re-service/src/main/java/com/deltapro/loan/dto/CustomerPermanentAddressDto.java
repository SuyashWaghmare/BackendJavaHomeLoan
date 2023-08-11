package com.deltapro.loan.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerPermanentAddressDto {

	//private int permanentAddressId;
	private String permanentLandmark;
	private String permanentAreaname;
	private String permanentCityname;
	private String permanentDistrict;
	private String permanentState;
	private int permanentPincode;

}
