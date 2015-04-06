package com.synisys.observer;

public interface SubjectCompany {

	public void registerObserver(ObserverDeveloper observer);
    public void removeObserver(ObserverDeveloper observer);
    public void notifyObservers();
}
