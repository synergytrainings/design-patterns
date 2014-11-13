package test.com.synisys.trainings.AdapterPattern.test;

import main.com.synisys.trainings.AdapterPattern.Project;
import main.com.synisys.trainings.AdapterPattern.impl.CurrencyAmount;

public class ProjectImpl implements Project {
	private int id;
	private String name;
	private CurrencyAmount currencyAmount;

	public ProjectImpl(int id, String name, CurrencyAmount currencyAmount) {
		this.id = id;
		this.name = name;
		this.currencyAmount = currencyAmount;
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public CurrencyAmount getCurrencyAmount() {
		return currencyAmount;
	}

	@Override
	public void setId(int id) {
		this.id = id;

	}

	@Override
	public void setName(String name) {
		this.name = name;

	}

	@Override
	public void setCurrencyAmount(CurrencyAmount amount) {
		this.currencyAmount = amount;
	}

}
