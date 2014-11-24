package com.synisys.trainings.designPatterns.composite.impl;

import java.util.ArrayList;
import java.util.List;

import com.synisys.trainings.designPatterns.composite.api.MenuItem;

public class SubMenu implements MenuItem {
	private List<MenuItem> menuItems = new ArrayList<MenuItem>();
	
	public void addMenuItem(MenuItem item) {
		menuItems.add(item);
	}

	public void removeMenuItem() {
		int menuItemsCount = menuItems.size();
		if(menuItemsCount < 1){
			throw new IllegalStateException();
		}
		menuItems.remove(menuItems.size() - 1);
	}

	public List<MenuItem> getMenuItems() {
		return this.menuItems;
	}

	public String draw() {
		String result = "SubMenu";
		for(int i = 0; i < this.menuItems.size(); i++){
			result = result + " " + this.menuItems.get(i).draw();
		}
		return result;
	}

}
