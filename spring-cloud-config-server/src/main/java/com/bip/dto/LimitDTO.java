package com.bip.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Data
@ConfigurationProperties("limit-service")
public class LimitDTO {
	Integer max;
	Integer min;
}
