package com.deltapro.loan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.deltapro.loan.model.Documents;

public interface CustomerDocumentRepository extends JpaRepository<Documents, Integer> {

}
