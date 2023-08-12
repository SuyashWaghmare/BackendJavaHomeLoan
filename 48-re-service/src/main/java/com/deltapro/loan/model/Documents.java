package com.deltapro.loan.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Documents {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int documentId;

	@Lob
	private byte[] panCard;

	@Lob
	private byte[] aadhaarCard;

	@Lob
	private byte[] photo;

	@Lob
	private byte[] mPropertyProof;

	@Lob
	private byte[] mPropertyInsurance;

	@Lob
	private byte[] psalarySlips;

	@Lob
	private byte[] propertyDocuments;

	@Lob
	private byte[] priceProofs;



}
