package com.deltapro.loan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deltapro.loan.model.CustomerEnquiry;
import com.deltapro.loan.service.CustomerEnquiryService;

@RestController
@RequestMapping("/re-api")
public class CustomerEnquiryController {

	@Autowired
	private CustomerEnquiryService customerEnquiryService;

	@PostMapping("/customerEnquiry")
	ResponseEntity<String> customerEnquiry(@RequestBody CustomerEnquiry customerenquiry) {
		customerEnquiryService.customerEnquiry(customerenquiry);
		return new ResponseEntity<String>("Your enquiry submitted successfully , We will contact you shortly ",
				HttpStatus.CREATED);

	}

	@GetMapping("/viewAllcustomerEnquiry")
	ResponseEntity<List<CustomerEnquiry>> viewAllcustomerEnquiry() {

		return new ResponseEntity<List<CustomerEnquiry>>(customerEnquiryService.viewAllcustomerEnquiry(),
				HttpStatus.OK);

	}

	@DeleteMapping("/deletEnquiry/{id}")
	ResponseEntity<String> deletEnquiry(@PathVariable int id) {

		return new ResponseEntity<String>(customerEnquiryService.deletEnquiry(id), HttpStatus.OK);
	}

}
