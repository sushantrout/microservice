package com.bip.currencyexchangeservice.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bip.currencyexchangeservice.dto.ExchangeValueDTO;

@RestController
@RequestMapping(value = "/api/currency-exchange")
public class CurrencyExchangeController {
	
	@GetMapping(value = "from/{from}/to{to}")
	public ExchangeValueDTO getCurrencyExchangeValue(@PathVariable String from, @PathVariable String to) {
		ExchangeValueDTO exchangeValueDTO = 
				new ExchangeValueDTO(0L, from, to, BigDecimal.valueOf(74.55), 8080);
		return exchangeValueDTO;
	}
}
