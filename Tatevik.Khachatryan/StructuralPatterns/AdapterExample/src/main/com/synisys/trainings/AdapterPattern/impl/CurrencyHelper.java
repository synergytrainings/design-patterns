package main.com.synisys.trainings.AdapterPattern.impl;

import java.math.BigDecimal;

public class CurrencyHelper {
	/**
	 * 
	 * @param currencyAmount 
	 * @return USD value calculated from passed currencyAmount
	 */
	public static BigDecimal getAmountUsd(CurrencyAmount currencyAmount) {
		BigDecimal projectAmountUsd = null;
		if (!Integer.valueOf(1).equals(currencyAmount.getCurrencyId())) {
			// TODO: calculate amount usd!
			projectAmountUsd = currencyAmount.getAmount().divide(
					BigDecimal.valueOf(2));
		} else {
			projectAmountUsd = currencyAmount.getAmount();
		}
		return projectAmountUsd;
	}
}
