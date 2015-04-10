package com.synisys.observer;

public class Demo {

    public static void main(String[] args) {
    	ObserverDeveloper firstObserverDeveloper=new ObserverDeveloperImpl("Harut");
        ObserverDeveloper secondObserverDeveloper=new ObserverDeveloperImpl("Narek");
        
        SubjectCompanyImpl synergy = new SubjectCompanyImpl("Synergy");
        
        synergy.registerObserver(firstObserverDeveloper);
        synergy.registerObserver(secondObserverDeveloper);
        synergy.removeObserver(firstObserverDeveloper);
        
        
        synergy.setPosition("Java Developer");
    }
}
