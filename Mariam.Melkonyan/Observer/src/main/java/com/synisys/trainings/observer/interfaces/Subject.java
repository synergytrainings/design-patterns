package com.synisys.trainings.observer.interfaces;


public interface Subject {
	public void attach(Observer observer);
    
    public void detach(Observer observer);
     
    public void notifyObservers();
}
