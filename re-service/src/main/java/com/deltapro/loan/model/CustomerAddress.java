package com.deltapro.loan.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class CustomerAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int addressid;

	@OneToOne(cascade = CascadeType.ALL)
	private CustomerPermanentAddress permanent;

	@OneToOne(cascade = CascadeType.ALL)
	private CustomerLocalAddress local;

}
