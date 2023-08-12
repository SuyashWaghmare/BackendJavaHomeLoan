package com.deltapro.loan.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerLocalAddressDto {

	//private int localAddressId;
	private String localLandmark;
	private String localAreaname;
	private String localCityname;
	private String localDistrict;
	private String localState;
	private int localPincode;

}
