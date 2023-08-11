package com.deltapro.loan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deltapro.loan.model.Customer;

@Repository
public interface CustomerRegistrationRepository extends JpaRepository<Customer, Integer> {

	

}
