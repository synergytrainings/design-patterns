package com.synisys.trainings.designPatterns.facade;

public class MapView {
	String adminBorder;
	
	
	public String getAdminBorder() {
		return adminBorder;
	}

	public void setAdminBorder(String adminBorder) {
		this.adminBorder = adminBorder;
	}


	public String draw(){
		return adminBorder + "is drawn";
	}
}
