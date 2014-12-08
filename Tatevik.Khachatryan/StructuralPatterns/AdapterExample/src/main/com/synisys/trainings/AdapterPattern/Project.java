package main.com.synisys.trainings.AdapterPattern;

import main.com.synisys.trainings.AdapterPattern.impl.CurrencyAmount;

/**
 * Class adapt to (destination class)
 * 
 * @author tatevik.khachatryan
 * 
 */
public interface Project {
	/**
	 * 
	 * @return Project Id
	 */
	public int getId();

	/**
	 * 
	 * @return project name
	 */
	public String getName();

	/**
	 * 
	 * @return project currencyAmount object
	 */
	public CurrencyAmount getCurrencyAmount();

	/**
	 * sets project id
	 * 
	 * @param id
	 */
	public void setId(int id);

	/**
	 * sets project name
	 * 
	 * @param name
	 */
	public void setName(String name);

	/**
	 * sets project currencyAmount
	 * 
	 * @param amount
	 */
	public void setCurrencyAmount(CurrencyAmount amount);
}
