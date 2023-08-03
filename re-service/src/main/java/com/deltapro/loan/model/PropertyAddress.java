package com.deltapro.loan.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PropertyAddress {

	@Id
	private int aid;
	private String areaName;
	private String cityName;
	private String district;
	private String state;
	private int pincode;
	private String streetName;
	
}