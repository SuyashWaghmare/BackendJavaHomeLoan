package com.deltapro.loan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
public class PropertyInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int propertyId;
	private String propertytype;
	private String propertyArea;
	private String propertyconstructionArea;
	private double propertyPrice;
	private double propertyconstructionPrice;

}
