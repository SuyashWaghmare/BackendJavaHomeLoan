package com.deltapro.loan.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class AllPersonalDocs {
	@Id
	private int documentID;
	private byte[] addressProof;
	private byte[] panCard;
	private byte[] itr;
	private byte[] adharCard;
	private byte[] photo;

}