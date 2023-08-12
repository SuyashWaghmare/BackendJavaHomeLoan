package com.deltapro.loan.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AccountDetailsDto {

	//private int accountId;
	private String bankName;
	private long accountNO;
	private String ifscCode;
	private String accountHoldersName;

}
