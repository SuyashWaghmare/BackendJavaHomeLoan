package com.deltapro.loan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AccountDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int accountId;
	private String bankName;
	private long accountNO;
	private String ifscCode;
	private String accountHoldersName;

}
