package com.bip.limit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bip.limit.dto.LimitConfig;

@RestController
@RequestMapping(value = "/api/limit")
public class LimitController {
	@Autowired
	LimitConfig limitConfig;

	@GetMapping
	public LimitConfig get() {
		return limitConfig; 
	}
}
