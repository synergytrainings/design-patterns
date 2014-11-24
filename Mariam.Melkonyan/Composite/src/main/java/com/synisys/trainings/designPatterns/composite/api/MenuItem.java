package com.synisys.trainings.designPatterns.composite.api;

import java.util.List;

public interface MenuItem{
	public void addMenuItem(MenuItem item);
	
	public void removeMenuItem();
	
	public List<MenuItem> getMenuItems();
	
	public String draw();
	
}
