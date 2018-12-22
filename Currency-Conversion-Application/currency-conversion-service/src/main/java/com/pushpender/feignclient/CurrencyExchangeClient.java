package com.pushpender.feignclient;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.pushpender.Bean.CurrencyConversionBean;

/*To call exchane service with exact path*/
/*@FeignClient(name="currency-exchange-service", url="localhost:8000")*/

/*To call exchange service with Ribbon Load Balancer, 
Ribbon will fetch the instances from eureka server and use these paths*/
/*@FeignClient(name="currency-exchange-service")*/

/*To route the calls to exchange service from Zuul Gateway, 
specifying path to Zuul gateway instead of exchange service*/
@FeignClient(name="netflix-zuul-api-gateway-server")
@RibbonClient(name="currency-exchange-service")
public interface CurrencyExchangeClient {

	// For Zuul APi Gateway, path will be /{app-name}/{api-path}
	//@GetMapping("/currency-exchange/from/{from}/to/{to}")
	@GetMapping("/currency-exchange-service/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversionBean currencyExchange(@PathVariable("from") String from, @PathVariable("to") String to);

}
