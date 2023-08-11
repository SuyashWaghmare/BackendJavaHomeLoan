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
@NoArgsConstructor
@AllArgsConstructor
public class CustomerLocalAddress {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int localAddressId;
	private String localLandmark;
	private String localAreaname;
	private String localCityname;
	private String localDistrict;
	private String localState;
	private int localPincode;

//	@OneToOne(mappedBy = "customerLocalAddress", cascade = CascadeType.ALL)
//	private Customer customer;

}
