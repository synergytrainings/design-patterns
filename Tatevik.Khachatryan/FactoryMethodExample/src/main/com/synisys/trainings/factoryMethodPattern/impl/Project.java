package main.com.synisys.trainings.factoryMethodPattern.impl;

/**
 * Concrete implementation of DeItem
 * 
 * @author tatevik.khachatryan
 * 
 */
public class Project extends DeItemImpl {
	public Project(Integer deItemId, String name){
		super(deItemId, name);
	}
	
	public String toString(){
		StringBuilder projectStr = new StringBuilder();
		projectStr.append("Id:").append(getId()==null?"":getId()).append(" ");
		projectStr.append("Name:").append(getName()==null?"":getName()).append("\n");
		return projectStr.toString();
	}
}
