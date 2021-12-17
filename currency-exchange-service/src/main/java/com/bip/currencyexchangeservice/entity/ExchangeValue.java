package com.bip.currencyexchangeservice.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "currency_values")
@AllArgsConstructor
@NoArgsConstructor
public class ExchangeValue {
	@Id
	private Integer id;
	
	@Column(name = "c_from")
	private String from;
	
	@Column(name = "c_to")
	private String to;
	
	@Column
	private BigDecimal conversionMultiple;
}
