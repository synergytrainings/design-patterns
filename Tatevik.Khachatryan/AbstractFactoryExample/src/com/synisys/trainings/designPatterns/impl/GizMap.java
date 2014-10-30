package com.synisys.trainings.designPatterns.impl;

import com.synisys.trainings.designPatterns.AbstractMap;

public class GizMap extends AbstractMap{
	private final static String PREFIX = "GIZ-";
	
	GizMap(String name){
		super(PREFIX + name);		
		System.out.println(String.format("Initializing Giz Map %s...", name));
	}
	
	@Override
	public void draw() { 
		System.out.println(String.format("Drawing Giz Map %s...", this.getMapName()));
	}
	
	@Override
	public void refresh() { 
		System.out.println(String.format("Refreshing Giz Map %s...", this.getMapName()));
	}
}
