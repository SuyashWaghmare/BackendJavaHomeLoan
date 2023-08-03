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
public class BankAddress {

	@Id
	public int aid;
	public String areaName;
	public String streetName;
	public String cityName;
	public int pincode;
	public String district;
	public String state;
	
	
}