package com.synisys.trainings.designPatterns;

public class Organisation {
	private String name;
	private String address;

	public Organisation(String name, String address){
		this.name = name;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String toString() {
		StringBuilder orgStr = new StringBuilder("Organisation - ");
		orgStr.append(name == null ? "" : name).append("\n");
		orgStr.append(address == null ? "" : address).append("\n");
		return orgStr.toString();
	}
}
