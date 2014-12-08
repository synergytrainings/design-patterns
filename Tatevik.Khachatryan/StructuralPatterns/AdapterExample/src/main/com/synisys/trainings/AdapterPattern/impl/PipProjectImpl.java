package main.com.synisys.trainings.AdapterPattern.impl;

import main.com.synisys.trainings.AdapterPattern.PipProject;

public class PipProjectImpl implements PipProject{
	private Integer pipProjectId;
	private String title;
	private Integer amount;

	public PipProjectImpl() {		
	}
	
	public PipProjectImpl(Integer pipProjectId, String title, Integer amount) {
		this.pipProjectId = pipProjectId;
		this.title = title;
		this.amount = amount;
	}

	@Override
	public Integer getPipProjectId() {
		return pipProjectId;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public Integer getAmount() {
		return amount;
	}

	@Override
	public void setPipProjectId(Integer pipProjectId) {
		this.pipProjectId = pipProjectId;
	}

	@Override
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public void setAmount(Integer amount) {
		this.amount = amount;
	}	
	
}
