package com.deltapro.loan.service;

import java.util.List;

import com.deltapro.loan.model.CustomerEnquiry;

public interface CustomerEnquiryService {

	void customerEnquiry(CustomerEnquiry customerenquiry);

	List<CustomerEnquiry> viewAllcustomerEnquiry();

	String deletEnquiry(int id);

}
