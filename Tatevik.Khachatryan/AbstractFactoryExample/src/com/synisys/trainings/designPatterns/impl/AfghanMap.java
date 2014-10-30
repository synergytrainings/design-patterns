package com.synisys.trainings.designPatterns.impl;

import com.synisys.trainings.designPatterns.AbstractMap;

public class AfghanMap extends AbstractMap{
	private final static String PREFIX = "AFG-";
	
	AfghanMap(String name){
		super(PREFIX + name);		
		System.out.println(String.format("Initializing Afghan Map %s...", name));
	}
	
	@Override
	public void draw() { 
		System.out.println(String.format("Drawing Afghan Map %s...", this.getMapName()));
	}
	
	@Override
	public void refresh() { 
		System.out.println(String.format("Refreshing Afghan Map %s...", this.getMapName()));
	}
}
