package main.com.synisys.trainings.AdapterPattern.impl;

import java.math.BigDecimal;

public class CurrencyAmount {
	private static final Integer DEFAULT_CURRENCY_ID = 1;
	
	private Integer currencyId;
	private BigDecimal amount;
	
	public CurrencyAmount(BigDecimal amount){
		this.currencyId = DEFAULT_CURRENCY_ID;
		this.amount = amount;
	}
	
	public CurrencyAmount(Integer currencyId, BigDecimal amount){
		this.currencyId = currencyId;
		this.amount = amount;
	}

	public Integer getCurrencyId() {
		return currencyId;
	}

	public void setCurrencyId(Integer currencyId) {
		this.currencyId = currencyId;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}		
}
