package com.skcc.payment.event.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface PaymentInputChannel {
	String orderCreated = "orderCreated";
	String orderCanceled = "orderCanceled";
	String orderPayFailed = "orderPayFailed";
	
	@Input(PaymentInputChannel.orderCreated)
	SubscribableChannel orderCreated();
	
	@Input(PaymentInputChannel.orderCanceled)
	SubscribableChannel orderCanceled();
	
	@Input(PaymentInputChannel.orderPayFailed)
	SubscribableChannel orderPayFailed();
	
}
