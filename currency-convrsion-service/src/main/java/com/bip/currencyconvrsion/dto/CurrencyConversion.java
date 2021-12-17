package com.bip.currencyconvrsion.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CurrencyConversion {
	private Integer id;
	private String from;
	private String to;
	private BigDecimal conversionMultiple;
	private int port;
	private BigDecimal totalCalculatedAmount;
}
