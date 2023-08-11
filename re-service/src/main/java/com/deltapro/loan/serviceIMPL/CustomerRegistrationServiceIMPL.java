package com.deltapro.loan.serviceIMPL;

import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import com.deltapro.loan.dto.CustomerDto;
import com.deltapro.loan.model.Customer;
import com.deltapro.loan.repository.CustomerRegistrationRepository;
import com.deltapro.loan.service.CustomerRegistrationService;

@Service
public class CustomerRegistrationServiceIMPL implements CustomerRegistrationService {

	@Autowired
	private JavaMailSender sender;

	@Autowired
	public ModelMapper mapper;

	@Autowired
	private CustomerRegistrationRepository customerRegistrationRepository;

	@Override // Registration with DTO
	public Customer registerCustomerDto(CustomerDto customerDto) {
		Customer customer = mapper.map(customerDto, Customer.class);
		Customer savedCustomer = customerRegistrationRepository.save(customer);
		sendCustomerRegistrationMail(savedCustomer);
		return savedCustomer;

	}

	@Override // Registration without DTO
	public void customerRegistration(Customer customer) {
		// TODO Auto-generated method stub
		Customer savedCustomer = customerRegistrationRepository.save(customer);
		sendCustomerRegistrationMail(savedCustomer);

	}

	public void sendCustomerRegistrationMail(Customer customer) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(customer.getCustomerEmail());
		message.setSubject("Welcome to our NeX Home Loan Application");
		message.setText("Dear " + customer.getCustomerName()

				+ ",\n\n Your registration is successfully completed !");
		sender.send(message);

	}

	@Override
	public CustomerDto getCustomerDtoById(int id) {
		Customer customer = customerRegistrationRepository.findById(id).orElse(null);

		if (customer != null) {

			return mapper.map(customer, CustomerDto.class); // Map the Customer entity to CustomerDto using ModelMapper

		}
		return null;

	}

	@Override // Update using DTO
	public Customer updateCustomerDto(CustomerDto requestDto, int id) {
		if (customerRegistrationRepository.existsById(id)) {
			Customer existingCustomer = customerRegistrationRepository.findById(id).get();

			mapper.map(requestDto, existingCustomer);

			return customerRegistrationRepository.save(existingCustomer);
		}
		return new Customer();

	}

	@Override
	public String deleteCustomer(int id) {
		// TODO Auto-generated method stub
		if (customerRegistrationRepository.existsById(id)) {

			customerRegistrationRepository.deleteById(id);

			return "Customer Deleted";

		} else
			return "Customer does not exist in our platform";

	}

	@Override
	public Object getCustomer(int id) {
		if (customerRegistrationRepository.existsById(id)) {

			return customerRegistrationRepository.findById(id).get();

		}

		else
			return "Cutomer does not exist in our platform";
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return customerRegistrationRepository.findAll();
	}

	public CustomerDto mapToDto(Customer customer) {
		return mapper.map(customer, CustomerDto.class);
	}

	@Override
	public Object getCustomerDto(int id) {
		if (customerRegistrationRepository.existsById(id)) {

			return customerRegistrationRepository.findById(id).get();

		}

		else
			return "Cutomer does not exist in our platform";
	}

	@Override // Update without DTO
	public Object updateCustomer(Customer customer, int id) {

		if (customerRegistrationRepository.existsById(id)) {
			Customer existingCustomer = customerRegistrationRepository.findById(id).get();

			return customerRegistrationRepository.save(existingCustomer);
		}
		return "Customer not found";

	}

}