package com.synisys.models;

import com.synisys.interfaces.Product;

public class Banana implements Product{
	private String description;
	
	public Banana(String description) {
		super();
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

}
