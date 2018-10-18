package com.skcc.accountbank.event.message;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AccountBankPayload {
	
	private long id;
	private long accountId;
	private String bankName;
	private String bankNumber;
	private String active;
	
}
