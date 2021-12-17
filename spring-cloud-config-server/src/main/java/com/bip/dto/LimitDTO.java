package com.bip.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@ConfigurationProperties("limit-service")
@Component
public class LimitDTO {
	Integer max;
	Integer min;
}
