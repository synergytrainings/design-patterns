package com.synisys.prototype.model;

import com.synisys.prototype.contract.PrototypeCapable;

public class Sector implements PrototypeCapable
{
	private String name = null;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public Sector clone() throws CloneNotSupportedException {
		System.out.println("Cloning Sector object..");
		return (Sector) super.clone();
	}
	@Override
	public String toString() {
		return "Sector";
	}
}
