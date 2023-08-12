package com.deltapro.loan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class CustomerPermanentAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int permanentAddressId;
	private String permanentLandmark;
	private String permanentAreaname;
	private String permanentCityname;
	private String permanentDistrict;
	private String permanentState;
	private int permanentPincode;

}
