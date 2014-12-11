package main.com.synisys.trainigs.designPatterns.impl;

import main.com.synisys.trainigs.designPatterns.DeItem;

public class PipProject implements DeItem {
	private String name;
	
	public PipProject(String name){
		this.name = name;
	}
	
	@Override
	public void submit() {
		System.out.println(String.format("PIP Project %s is submitted!", this.name));
	}

	@Override
	public void approve() {
		System.out.println(String.format("PIP Project %s is approved!", this.name));
	}
}