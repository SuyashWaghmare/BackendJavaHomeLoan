package com.deltapro.loan.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.deltapro.loan.dto.CustomerDto;
import com.deltapro.loan.model.Customer;
import com.deltapro.loan.service.CustomerRegistrationService;

@RestController
@RequestMapping("/re-api")
public class CustomerRegistrationController {

	@Autowired
	private CustomerRegistrationService customerRegistrationService;

//  Registration Method using DTO

	@PostMapping("/registerCustomerDto") // with DTO
	public ResponseEntity<CustomerDto> registerCustomerDto(@RequestBody CustomerDto requestDto) {
		Customer registeredCustomer = customerRegistrationService.registerCustomerDto(requestDto);
		CustomerDto responseDto = customerRegistrationService.mapToDto(registeredCustomer);
		return ResponseEntity.ok(responseDto);
	}

	@GetMapping("/getCustomerDtoById/{id}") // with DTO
	ResponseEntity<CustomerDto> getCustomerDtoById(@PathVariable int id) {
		CustomerDto customerDto = customerRegistrationService.getCustomerDtoById(id);

		return ResponseEntity.status(HttpStatus.OK).body(customerDto);
	}

	// Customer Methods without DTO

	@GetMapping("/getAllCustomer") // without DTO
	ResponseEntity<List<Customer>> getAllCustomer() {
		return new ResponseEntity<List<Customer>>(customerRegistrationService.getAllCustomer(), HttpStatus.OK);

	}

	@GetMapping("/getCustomer/{id}") // without DTO
	ResponseEntity<Object> getCustomer(@PathVariable int id) {
		return new ResponseEntity<Object>(customerRegistrationService.getCustomer(id), HttpStatus.OK);

	}

	@DeleteMapping("/deleteCustomer/{id}") // without DTO
	ResponseEntity<String> deleteCustomer(@PathVariable int id) {

		return new ResponseEntity<String>(customerRegistrationService.deleteCustomer(id), HttpStatus.OK);
	}

	@PostMapping("/customerRegistration") // without DTO
	public ResponseEntity<Customer> customerRegistration(@RequestBody Customer customer) {

		customerRegistrationService.customerRegistration(customer);

		return ResponseEntity.status(HttpStatus.CREATED).body(customer);
	}

//	Update methods

	@PutMapping("/updateCustomerDto/{id}") // Update using DTO
	public ResponseEntity<CustomerDto> updateCustomer(@PathVariable int id, @RequestBody CustomerDto requestDto) {
		Customer updateCustomer = customerRegistrationService.updateCustomerDto(requestDto, id);
		CustomerDto responseDto = customerRegistrationService.mapToDto(updateCustomer);
		return ResponseEntity.ok(responseDto);

	}

	@PutMapping("/updateCustomer/{id}") // Update without DTO
	public ResponseEntity<String> updateCustomer(@RequestBody Customer customer, @PathVariable int id) {
		String msg = customerRegistrationService.updateCustomer(customer, id);
		return ResponseEntity.status(HttpStatus.CREATED).body(msg);
	}

}
