package com.synisys.os.gui.impl;

import com.synisys.os.gui.EditBox;

public abstract class EditBoxImpl implements EditBox{
	private String text;
	
	public EditBoxImpl(String text){
		this.text = text;
	}
	
	@Override
	public void setText(String text) {
		this.text = text;
	}
	
	@Override
	public String getText() {
		return text;
	}
}
