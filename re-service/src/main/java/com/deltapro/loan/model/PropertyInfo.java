package com.deltapro.loan.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Builder

public class PropertyInfo {
	private int propertyId;
	private String propertytype;
	private String propertyArea;
	private String constructionArea;
	private double propertyPrice;
	private double constructionPrice;
	private Byte[] propertyDocuments;
	private Byte[] priceProofs;
	@OneToOne
	private PropertyAddress propertyAddress;
	
	
	

}
