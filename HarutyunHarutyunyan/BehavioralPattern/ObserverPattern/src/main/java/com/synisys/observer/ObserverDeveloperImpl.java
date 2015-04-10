package com.synisys.observer;

public class ObserverDeveloperImpl implements ObserverDeveloper{

	String developerName;

	public ObserverDeveloperImpl(String developerName) {
		this.developerName = developerName;
	}

	public String getDeveloperName() {
		return developerName;
	}

	public void setDeveloperName(String developerName) {
		this.developerName = developerName;
	}

	public void update(String possition) {
		
		System.out.println("Hello " + developerName + ", our companay has a " + possition +" vacant possition");
	}
}
