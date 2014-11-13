package main.com.synisys.trainings.AdapterPattern.impl;

import java.math.BigDecimal;

import main.com.synisys.trainings.AdapterPattern.PipProject;
import main.com.synisys.trainings.AdapterPattern.Project;

/**
 * Project adapter implementation via object usage inside the class
 * 
 * @author tatevik.khachatryan
 * 
 */
public class ProjectObjectAdapter implements Project {
	private static final String PROJECT_PREFIX = "PRJ/";

	private PipProject pipProject = null;

	public ProjectObjectAdapter(PipProject pipProject) {
		this.pipProject = pipProject;
	}

	@Override
	public int getId() {
		return pipProject.getPipProjectId().intValue();
	}

	@Override
	public String getName() {
		StringBuilder name = new StringBuilder(PROJECT_PREFIX);
		name.append(pipProject.getTitle());
		return name.toString();
	}

	@Override
	public CurrencyAmount getCurrencyAmount() {
		BigDecimal amount = new BigDecimal(pipProject.getAmount());
		return new CurrencyAmount(amount);
	}

	@Override
	public void setId(int id) {
		pipProject.setPipProjectId(Integer.valueOf(id));
	}

	@Override
	public void setName(String name) {
		String title = name.substring(name.indexOf("/") + 1);
		pipProject.setTitle(title);
	}

	@Override
	public void setCurrencyAmount(CurrencyAmount currencyAmount) {
		pipProject.setAmount(CurrencyHelper.getAmountUsd(currencyAmount).intValueExact());
	}
}
