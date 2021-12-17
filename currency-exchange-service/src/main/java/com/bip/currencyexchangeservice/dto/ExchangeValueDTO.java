package com.bip.currencyexchangeservice.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExchangeValueDTO {
	private Long id;
	private String from;
	private String to;
	private BigDecimal conversionMultiple;
	private int port;
}
