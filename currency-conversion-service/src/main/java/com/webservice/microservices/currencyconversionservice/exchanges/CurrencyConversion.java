package com.webservice.microservices.currencyconversionservice.exchanges;

import java.math.BigDecimal;


public class CurrencyConversion {
    private Long id;
    private String from;
    private String to;
    private BigDecimal conversionMultiple;
    private BigDecimal quantity;
    private BigDecimal totalCalculatedAmount;
    private String environment;

    public CurrencyConversion(){

    }
    public CurrencyConversion(Long id,String from,String to,BigDecimal conversionMultiple,BigDecimal quantity,BigDecimal totalCalculatedAmount,String environment){
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
        this.quantity = quantity;
        this.totalCalculatedAmount = totalCalculatedAmount;
        this.environment = environment;
    }
    public void setEnvironment(String port){
        this.environment = port;
    }
    public String getEnvironment(){
        return environment;
    }
    public void setId(Long id){
        this.id = id;
    }
    public Long getId(){
        return id;
    }

    public void setFrom(String from){
        this.from = from;
    }
    public String getFrom(){
        return from;
    }
    public void setTo(String to){
        this.to = to;
    }
    public String getTo(){
        return to;
    }

    public void setConversionMultiple(BigDecimal conversionMultiple){
        this.conversionMultiple = conversionMultiple;
    }
    public BigDecimal getConversionMultiple(){
        return conversionMultiple;
    }
    public void setQuantity(BigDecimal quantity){
        this.quantity = quantity;
    }
    public BigDecimal getQuantity(){
        return quantity;
    }
    public void setTotalCalculatedAmount(BigDecimal totalCalculatedAmount){
        this.totalCalculatedAmount = totalCalculatedAmount;
    }
    public BigDecimal getTotalCalculatedAmount(){
        return totalCalculatedAmount;
    }
}
