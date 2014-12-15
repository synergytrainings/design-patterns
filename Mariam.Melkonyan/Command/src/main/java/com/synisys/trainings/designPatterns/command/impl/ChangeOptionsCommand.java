package com.synisys.trainings.designPatterns.command.impl;

import com.synisys.trainings.designPatterns.command.api.Command;
import com.synisys.trainings.designPatterns.command.api.Options;

public class ChangeOptionsCommand implements Command {
	private Options options = null;
		
	public void onOkClicked() {
		String result = "";
		if(options.hideEmptyRows()){
			result += "Empty Rows are hidden !! ";
		}
		if(options.hideUnspecifiedRows()){
			result += "Empty Rows are hidden !! ";
		}
		System.out.println(result);
	}

	public void onCancelClicked() {
		System.out.println("Options are not changed");
	}
	
	public void setOptions(Options options){
		this.options = options;
	}

}
