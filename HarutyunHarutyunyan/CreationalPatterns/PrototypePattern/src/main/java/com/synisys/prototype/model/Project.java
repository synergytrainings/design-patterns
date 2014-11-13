package com.synisys.prototype.model;

import com.synisys.prototype.contract.PrototypeCapable;

public class Project implements PrototypeCapable
{
	private String name = null;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public Project clone() throws CloneNotSupportedException {
		System.out.println("Cloning Project object..");
		return (Project) super.clone();
	}
	@Override
	public String toString() {
		return "Project";
	}
}