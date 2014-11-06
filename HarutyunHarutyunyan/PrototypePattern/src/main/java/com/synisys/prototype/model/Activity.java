package com.synisys.prototype.model;

import com.synisys.prototype.contract.PrototypeCapable;

public class Activity implements PrototypeCapable
{
	private String name = null;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public Activity clone() throws CloneNotSupportedException {
		System.out.println("Cloning Activity object..");
		return (Activity) super.clone();
	}
	@Override
	public String toString() {
		return "Activity";
	}
}