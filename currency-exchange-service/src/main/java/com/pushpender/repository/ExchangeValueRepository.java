package com.pushpender.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pushpender.bean.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long>{
	
	ExchangeValue findByFromAndTo(String from, String to);
}
