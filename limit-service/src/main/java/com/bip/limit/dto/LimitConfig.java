package com.bip.limit.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@ConfigurationProperties("limit-service")
@Component
@Getter
@Setter
public class LimitConfig {
	private Integer max;
	private Integer min;
}
