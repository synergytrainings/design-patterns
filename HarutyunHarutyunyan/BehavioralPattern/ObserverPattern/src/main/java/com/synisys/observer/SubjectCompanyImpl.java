package com.synisys.observer;

import java.util.ArrayList;

public class SubjectCompanyImpl implements SubjectCompany{

	private ArrayList<ObserverDeveloper> observers = new ArrayList<ObserverDeveloper>();
    private String companyName;
    private String position;
    
    
	public SubjectCompanyImpl(String companyName) {
		this.companyName = companyName;
	}
	
	public ArrayList<ObserverDeveloper> getObservers() {
		return observers;
	}
	public void setObservers(ArrayList<ObserverDeveloper> observers) {
		this.observers = observers;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
		notifyObservers();
	}

	public void notifyObservers() {
		 for (ObserverDeveloper ob : observers) {
             ob.update(this.position );
      }
	}

	public void registerObserver(ObserverDeveloper observer) {
		 observers.add(observer);
	}

	public void removeObserver(ObserverDeveloper observer) {
		 observers.remove(observer);
	}
}
