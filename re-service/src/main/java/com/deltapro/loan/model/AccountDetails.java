package com.deltapro.loan.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Builder
public class AccountDetails {
	@Id
	private int accountid;
	private String accounttype;
	private double accountBalance;
	private String accountHolderName;
	private String accountStatus;
	private long accountNO;   

}
