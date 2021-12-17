package com.bip.currencyexchangeservice.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.bip.currencyexchangeservice.entity.ExchangeValue;

public interface CurrencyExchangeRepository extends CrudRepository<ExchangeValue, Long> {
	Optional<ExchangeValue> findByFromAndTo(String from, String to);
}
