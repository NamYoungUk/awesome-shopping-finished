package com.skcc.accountbank.event.message;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AccountBankEvent {
	
	private long id;
	private String domain;
	private long accountBankId;
	private AccountBankEventType eventType;
	private AccountBankPayload payload;
	private String txId;
	private String createdAt;
	
}
