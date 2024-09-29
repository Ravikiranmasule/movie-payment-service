package com.rk.movie.ticket.payment.system.service.apis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentApi {
	
	@GetMapping
	public String getPayment() {
		return "successful payment";
	}

}
