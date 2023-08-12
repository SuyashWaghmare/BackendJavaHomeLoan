package com.deltapro.loan.service;


import com.deltapro.loan.model.Documents;

public interface CustomerDocumentService {

	String saveDocument(Documents documents, int id);

	Object getDocumentsById(int id);
}
