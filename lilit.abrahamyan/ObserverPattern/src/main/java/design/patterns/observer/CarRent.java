package design.patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Observer pattern implementation
 * @author lilit.abrahamyan
 *
 */
public class CarRent {

	private String model;
	private int year;
	private boolean available;
	
	private List<Observer> observers;
	
	public CarRent(String model, int year, boolean available) {
		observers = new ArrayList<Observer>();
		this.model = model;
		this.year = year;
		this.available = available;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
		if (available) {
			notifyAllObervers();
		}
	}
	
	public void register(Observer client){
		observers.add(client);
	}
	
    public void unregister(Observer obj){
    	observers.remove(obj);
    }
    
    public void notifyAllObervers(){
    	for (Observer o : observers){
    		o.notifyClients();
    	}
    }
}
