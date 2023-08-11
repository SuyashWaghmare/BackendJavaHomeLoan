package com.deltapro.loan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Enquiry")
public class CustomerEnquiry {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerEnquiryID;

	private String customerEnquiryName;

	private int customerEnquiryAge;

	private long customerEnquiryMobileName;

	private String customerEnquiryEmail;

	private String customerEnquiryPancard;

}
