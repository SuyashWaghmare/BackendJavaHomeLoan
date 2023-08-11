package com.deltapro.loan.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Employee {

	@Id
	private int empid;
	private String name;
	private String designation;
	private double salary;
	private String username;
	private String password;
	private String status;

	@OneToOne
	private EmployeeAddress address;

}
