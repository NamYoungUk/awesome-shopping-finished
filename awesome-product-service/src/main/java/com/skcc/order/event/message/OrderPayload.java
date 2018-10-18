package com.skcc.order.event.message;

import java.util.List;

import com.skcc.order.domain.OrderAccount;
import com.skcc.order.domain.OrderPayment;
import com.skcc.order.domain.OrderProduct;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OrderPayload {
	
	private OrderAccount orderAccount;
	private OrderPayment orderPayment;
	private List<OrderProduct> orderProducts;
	
}
