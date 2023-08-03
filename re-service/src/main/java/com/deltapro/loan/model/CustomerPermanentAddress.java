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
	private int pa_Id;
	private int pa_Houseno;
	private String pa_Landamrk;
	private String pa_Areaname;
	private String pa_Cityname;
	private String pa_District;
	private String pa_State;
	private double pa_Pincode;

}
