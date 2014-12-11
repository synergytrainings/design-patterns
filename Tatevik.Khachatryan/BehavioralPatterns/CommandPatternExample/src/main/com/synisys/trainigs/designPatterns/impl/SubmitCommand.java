package main.com.synisys.trainigs.designPatterns.impl;

import main.com.synisys.trainigs.designPatterns.Command;
import main.com.synisys.trainigs.designPatterns.DeItem;

public class SubmitCommand implements Command {
	private DeItem deItem;
	
	public SubmitCommand(DeItem deItem){
		this.deItem = deItem;
	}
	
	@Override
	public void execute() {
		deItem.submit();
	}

}
