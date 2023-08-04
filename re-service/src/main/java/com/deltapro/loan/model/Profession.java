package com.deltapro.loan.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Profession {

	@Id
	private int pid;
	private String ptype;
	private Double psalary;
	private String psalaryType;
	private String pworkingPeriod;
	private String pDesignation;
	private byte[] psalarySlips;

}
