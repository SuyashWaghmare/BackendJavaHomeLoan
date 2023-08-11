package com.deltapro.loan.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DependentInfoDto {

	//private int dependentInfoId;
	private String fatherName;
	private String motherName;
	private int noOfFamilyMember;
	private int noOfChild;
	private String maritalStatus;
	private int dependentMember;
	private double familyIncome;
	private String spouseName;

}
