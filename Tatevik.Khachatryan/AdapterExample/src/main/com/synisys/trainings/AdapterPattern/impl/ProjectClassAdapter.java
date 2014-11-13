package main.com.synisys.trainings.AdapterPattern.impl;

import java.math.BigDecimal;

import main.com.synisys.trainings.AdapterPattern.Project;
/**
 * Project adapter implementation via class extension
 * @author tatevik.khachatryan
 *
 */
public class ProjectClassAdapter extends PipProjectImpl implements Project {
	private static final String PROJECT_PREFIX = "PRJ/";
			
	@Override	
	public int getId() {
		return getPipProjectId().intValue();
	}

	/**
	 * method returns Project name constructed using PipProject title
	 */
	@Override	
	public String getName() {
		StringBuilder name = new StringBuilder(PROJECT_PREFIX);
		name.append(getTitle());
		return name.toString();
	}

	/**
	 * method returns Project currencyAmount constructed based on PipProject amount
	 */
	@Override	
	public CurrencyAmount getCurrencyAmount() {
		BigDecimal amount = new BigDecimal(getAmount());
		return new CurrencyAmount(amount);
	}
	
	/**
	 * Sets pipProjectId based on passed project id
	 */
	@Override
	public void setId(int id) {		
		this.setPipProjectId(Integer.valueOf(id));
	}

	/**
	 * Sets pipProject name constructed based on passed project name
	 */
	@Override
	public void setName(String name) {
		String title = name.substring(name.indexOf("/")+1);
		this.setTitle(title);
	}

	/**
	 * Sets pipProject amount constructed based on project currency amount amount
	 */
	@Override
	public void setCurrencyAmount(CurrencyAmount currencyAmount) {
		this.setAmount(CurrencyHelper.getAmountUsd(currencyAmount).intValueExact());
	}	
}
