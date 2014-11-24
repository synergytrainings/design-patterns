package com.synisys.models;

import com.synisys.interfaces.Product;

public class Boots implements Product{
	private String description ;
	
	public Boots(String description) {
		super();
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}

}
