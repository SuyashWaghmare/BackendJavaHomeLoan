package com.deltapro.loan.serviceIMPL;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import com.deltapro.loan.model.CustomerEnquiry;
import com.deltapro.loan.repository.CustomerEnquiryRepository;
import com.deltapro.loan.service.CustomerEnquiryService;

@Service
public class CustomerEnquiryServiceIMPL implements CustomerEnquiryService {

	@Autowired
	private JavaMailSender sender;

	@Autowired
	private CustomerEnquiryRepository customerEnquiryRepository;

	@Override
	public void customerEnquiry(CustomerEnquiry customerenquiry) {
		// TODO Auto-generated method stub
		CustomerEnquiry enquiry = customerEnquiryRepository.save(customerenquiry);
		sendCustomerEnquiryMail(enquiry);
	}

	public void sendCustomerEnquiryMail(CustomerEnquiry customerenquiry) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(customerenquiry.getCustomerEnquiryEmail());
		message.setSubject("Welcome to our NeX Home Loan Application");
		message.setText("Dear " + customerenquiry.getCustomerEnquiryName()
				+ ",\n\n Thank You for Your Enquiry on our platform !"
				+ "\n\n Our Relational Executive will contact you");
		sender.send(message);

	}

	@Override
	public List<CustomerEnquiry> viewAllcustomerEnquiry() {
		return customerEnquiryRepository.findAll();
	}

	@Override
	public String deletEnquiry(int id) {
		// TODO Auto-generated method stub
		if (customerEnquiryRepository.existsById(id)) {

			customerEnquiryRepository.deleteById(id);

			return "Enquiry Deleted";

		} else
			return "Enquiry Not in List";
	}

}
