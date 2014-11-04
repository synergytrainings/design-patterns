package com.synisys.os.gui.impl;

import com.synisys.os.gui.Button;

public abstract class ButtonImpl implements Button {
	private String name;
	
	public ButtonImpl(String name){
		this.name = name;
	}
	
	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
	}
}
