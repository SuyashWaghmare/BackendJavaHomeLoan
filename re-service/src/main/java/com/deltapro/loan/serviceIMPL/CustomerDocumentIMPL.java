package com.deltapro.loan.serviceIMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import com.deltapro.loan.model.Customer;
import com.deltapro.loan.model.Documents;
import com.deltapro.loan.repository.CustomerDocumentRepository;
import com.deltapro.loan.repository.CustomerRegistrationRepository;
import com.deltapro.loan.service.CustomerDocumentService;

@Service
public class CustomerDocumentIMPL implements CustomerDocumentService {

	@Autowired
	private CustomerRegistrationRepository customerRegistrationRepository;

	@Autowired
	private CustomerDocumentRepository customerDocumentRepository;

	@Autowired
	private JavaMailSender sender;

	@Override
	public String saveDocument(Documents documents, int id) {

		if (customerRegistrationRepository.existsById(id)) {

			Customer customer = customerRegistrationRepository.findById(id).get();
			customerDocumentRepository.save(documents);
			customer.setDocuments(documents);
			Customer savedDocuments = customerRegistrationRepository.save(customer);
			sendCustomerRegistrationMail(savedDocuments);

			return "Document Uploaded";
		}
		return "Customer not found";

	}

	public void sendCustomerRegistrationMail(Customer customer) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(customer.getCustomerEmail());
		message.setSubject("Welcome to our NeX Home Loan Application");
		message.setText("Dear " + customer.getCustomerName()

				+ ",\n\n Your Documents are successfully registered !"
				+ "\n\n And have gone under the verification process.");
		sender.send(message);

	}

	@Override
	public Object getDocumentsById(int id) {
		if (customerRegistrationRepository.existsById(id)) {
			Customer customer = customerRegistrationRepository.findById(id).orElse(null);

			if (customer != null && customer.getDocuments() != null) {
				return customer.getDocuments();
			} else {
				return "No documents found for the customer";
			}
		} else {
			return "Customer does not exist in our platform";
		}
	}
}