package com.synisys.trainings.ChainOfResponsibility;

public class Request {
	private int value;
	private String description;

	public Request(String description, int value)
	{
		this.description = description;
		this.value = value;
	}

	public int getValue()
	{
		return value;
	}

	public String getDescription()
	{
		return description;
	}          
}
