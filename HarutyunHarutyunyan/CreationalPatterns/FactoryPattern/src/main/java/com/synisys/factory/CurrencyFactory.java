package com.synisys.factory;

import com.synisys.currency.Currency;
import com.synisys.currency.Dram;
import com.synisys.currency.USDollar;

public class CurrencyFactory {

	public enum CountryName {
		USA, Armenia
	}

	public static Currency createCurrency(CountryName countryName) {
		switch (countryName) {
			case USA:
				return new USDollar();
			case Armenia:
				return new Dram();
			default:
				throw new IllegalArgumentException("No such currency");
		}

	}
}
