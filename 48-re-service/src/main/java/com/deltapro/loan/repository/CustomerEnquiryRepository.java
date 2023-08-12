package com.deltapro.loan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deltapro.loan.model.CustomerEnquiry;

public interface CustomerEnquiryRepository extends JpaRepository<CustomerEnquiry, Integer> {

}
