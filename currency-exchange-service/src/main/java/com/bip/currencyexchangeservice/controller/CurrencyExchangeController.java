package com.bip.currencyexchangeservice.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bip.currencyexchangeservice.dto.ExchangeValueDTO;
import com.bip.currencyexchangeservice.entity.ExchangeValue;
import com.bip.currencyexchangeservice.service.CurrencyExchangeService;

@RestController
@RequestMapping(value = "/api/currency-exchange")
public class CurrencyExchangeController {

	@Autowired
	Environment environment;

	@Autowired
	CurrencyExchangeService service;

	@PostMapping
	public ExchangeValue insert(@RequestBody ExchangeValue exchangeValue) {
		return service.insert(exchangeValue);
	}

	@GetMapping(value = "from/{from}/to/{to}")
	public ExchangeValueDTO getCurrencyExchangeValue(@PathVariable String from, @PathVariable String to) {
		int port = Integer.parseInt(environment.getProperty("local.server.port"));
		//Integer.parseInt(environment.getProperty("local.server.port")));
		ExchangeValue findOne = service.findOne(from, to);
		ExchangeValueDTO exchangeValueDTO = new ExchangeValueDTO();
		exchangeValueDTO.setId(findOne.getId());
		exchangeValueDTO.setConversionMultiple(findOne.getConversionMultiple());
		exchangeValueDTO.setFrom(findOne.getFrom());
		exchangeValueDTO.setTo(findOne.getTo());
		exchangeValueDTO.setPort(port);
		return exchangeValueDTO;
	}
}
