package com.deltapro.loan.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class DependentInfo
{
	@Id
	private int did;
	private String fatherName;
	private String motherName;
	private int noOfFamilyMember;
	private int noOfChild;
	private String maritalStatus;
	private int dependentMember;
	private double familyIncome;
	private String spouseName;

}
