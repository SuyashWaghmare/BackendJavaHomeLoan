package com.deltapro.loan.service;

import java.util.List;
import com.deltapro.loan.dto.CustomerDto;
import com.deltapro.loan.model.Customer;

public interface CustomerRegistrationService {

	Customer registerCustomerDto(CustomerDto requestDto);

	CustomerDto getCustomerDtoById(int id);
	
	Object getCustomerDto(int id);
	

	Customer updateCustomerDto(CustomerDto requestDto, int id);

	CustomerDto mapToDto(Customer registeredCustomer);

	
	
	
	

	void customerRegistration(Customer customer);

	List<Customer> getAllCustomer();

	Object getCustomer(int id);

	String deleteCustomer(int id);

	Object updateCustomer(Customer customer, int id);

}
