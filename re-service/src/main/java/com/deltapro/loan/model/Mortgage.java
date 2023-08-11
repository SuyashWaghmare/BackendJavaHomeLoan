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
public class Mortgage {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int mortgageId;
	private Double mortgagePropertyValue;
	private String mortgagePropertyType;
	private Double mortgageLoanOnProperty;

}
