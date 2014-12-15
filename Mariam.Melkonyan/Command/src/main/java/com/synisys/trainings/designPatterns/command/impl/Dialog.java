package com.synisys.trainings.designPatterns.command.impl;

import com.synisys.trainings.designPatterns.command.api.Command;

public class Dialog {
	private String name;
	private Command receiver; 
	
	public Dialog(String name, Command receiver) {
		this.name = name;
		this.receiver = receiver;
	}
	
	public void clickOk(){
		this.receiver.onOkClicked();
	} 
	
	public void clickCancel(){
		this.receiver.onCancelClicked();
	}
	
}
