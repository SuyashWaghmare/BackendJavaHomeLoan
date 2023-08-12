package com.deltapro.loan.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.deltapro.loan.model.Documents;
import com.deltapro.loan.response.ApiResponse;
import com.deltapro.loan.service.CustomerDocumentService;

@RestController
@CrossOrigin("*")
@RequestMapping("/doc-api")
public class CustomerDocumentController {

	@Autowired
	private CustomerDocumentService documentService;

	@PostMapping(value = "/customerDocsUpload/{id}", consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = {
			"application/json" })
	public ResponseEntity<ApiResponse> saveDocument(@RequestPart MultipartFile PanCard,
			@RequestPart MultipartFile AadhaarCard, @RequestPart MultipartFile Photo,
			@RequestPart MultipartFile PropertyProof, @RequestPart MultipartFile PropertyInsurance,
			@RequestPart MultipartFile SalarySlips, @RequestPart MultipartFile PropertyDocuments,
			@RequestPart MultipartFile PriceProofs, @PathVariable int id) {

		Documents documents = new Documents();

		try {
			documents.setPanCard(PanCard.getBytes());
			documents.setAadhaarCard(AadhaarCard.getBytes());
			documents.setPhoto(Photo.getBytes());
			documents.setMPropertyProof(PropertyProof.getBytes());
			documents.setMPropertyInsurance(PropertyInsurance.getBytes());
			documents.setPsalarySlips(SalarySlips.getBytes());
			documents.setPropertyDocuments(PropertyDocuments.getBytes());
			documents.setPriceProofs(PriceProofs.getBytes());

		} catch (IOException e) {
			e.printStackTrace();
		}

		String msg = documentService.saveDocument(documents, id);

		return ResponseEntity.status(HttpStatus.CREATED).body(ApiResponse.builder().resp(msg).build());
	}

	@GetMapping("/getDocumentsById/{id}")
	public ResponseEntity<byte[]> getDocumentsById(@PathVariable int id) {
		Object documents = documentService.getDocumentsById(id);

		if (documents instanceof Documents) {
			Documents customerDocuments = (Documents) documents;

			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.IMAGE_JPEG); // Set the correct content type here
			headers.setContentType(MediaType.IMAGE_PNG);

			return new ResponseEntity<>(customerDocuments.getPanCard(), headers, HttpStatus.OK);
		} else if (documents instanceof String) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(((String) documents).getBytes());
		} else {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
}