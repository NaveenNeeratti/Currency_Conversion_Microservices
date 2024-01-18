package com.webservice.microservices.currencyconversionservice.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.webservice.microservices.currencyconversionservice.exchanges.CurrencyConversion;


@FeignClient(name="currency-exchange")
public interface CurrencyExchangeProxy{
    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyConversion retrieveExchangeValue(@PathVariable(name = "from",required = true) String from,@PathVariable(name = "to",required = true)  String to);
}