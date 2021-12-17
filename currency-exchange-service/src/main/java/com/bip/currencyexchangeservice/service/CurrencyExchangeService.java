package com.bip.currencyexchangeservice.service;

import java.util.Currency;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bip.currencyexchangeservice.entity.ExchangeValue;
import com.bip.currencyexchangeservice.repository.CurrencyExchangeRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CurrencyExchangeService {

	@Autowired
	private CurrencyExchangeRepository repository;

	public ExchangeValue insert(ExchangeValue exchangeValue) {
		return repository.save(exchangeValue);
	}
	
	public ExchangeValue findOne(String from, String to) {
		log.info(from);
		log.info(to);
		return repository.findByFromAndTo(from, to).orElse(new ExchangeValue());
	}

}
