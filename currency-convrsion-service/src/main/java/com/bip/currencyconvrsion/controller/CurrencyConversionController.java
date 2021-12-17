package com.bip.currencyconvrsion.controller;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.bip.currencyconvrsion.dto.CurrencyConversion;

@RestController
@RequestMapping(value = "/api/currency-conversion")
public class CurrencyConversionController {

	@Value("${curency-conversion-http.uri}")
	public String url;

	@GetMapping(value = "from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion get(@PathVariable String from, @PathVariable String to, @PathVariable Double quantity) {
		Map<String, String> paramValues = new LinkedHashMap<>();
		paramValues.put("from", from);
		paramValues.put("to", to);
		ResponseEntity<CurrencyConversion> forEntity = new RestTemplate().getForEntity(url, CurrencyConversion.class, paramValues);
		CurrencyConversion body = forEntity.getBody();
		BigDecimal multiply = body.getConversionMultiple().multiply(BigDecimal.valueOf(quantity));
		body.setTotalCalculatedAmount(multiply);
		return body;
	}
}
