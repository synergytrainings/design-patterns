package com.synisys.trainings.designPatterns.composite.impl;

import java.util.ArrayList;

import com.synisys.trainings.designPatterns.composite.api.MenuItem;

public class StandardMenuItem implements MenuItem {
	private String name;
	public StandardMenuItem(String name){
		this.name = name;
	}

	public void addMenuItem(MenuItem item) {
		throw new UnsupportedOperationException("This method is not supported");

	}

	public void removeMenuItem() {
		throw new UnsupportedOperationException("This method is not supported");

	}

	public ArrayList<MenuItem> getMenuItems() {
		throw new UnsupportedOperationException("This method is not supported");
	}

	public String draw() {
		return "StandardMenuItem " + this.name;
	}


}
