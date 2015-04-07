package com.synisys.trainings.observer.impl;

import java.util.ArrayList;
import java.util.List;

import com.synisys.trainings.observer.interfaces.Observer;
import com.synisys.trainings.observer.interfaces.Subject;

public class MapModel implements Subject{
	private List<Observer> observers = null;
	private Integer adminBorderId = null;
	
	public MapModel() {
		observers = new ArrayList<Observer>();
	}
	
	public void attach(Observer observer) {
		observers.add(observer);
	}

	public void detach(Observer observer) {
		observers.remove(observer);
	}

	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(this.adminBorderId);
		}
	}
	
	public Integer getAdminBorderId(){
		return this.adminBorderId;
	}
	
	public void setAdminBorderId(Integer adminBorderId){
		this.adminBorderId = adminBorderId;
		this.notifyObservers();
	}

}
