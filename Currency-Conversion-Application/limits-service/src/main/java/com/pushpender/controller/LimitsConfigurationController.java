package com.pushpender.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pushpender.bean.LimitConfiguration;
import com.pushpender.configuration.Limits;

@RestController
public class LimitsConfigurationController {

	@Autowired
	private Limits limits;
	
	@GetMapping("/limits")
	public LimitConfiguration reteriveLimitConfigurations() {
		return new LimitConfiguration(limits.getMaximum(), limits.getMinimum());
	}
}
