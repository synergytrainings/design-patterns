package main.com.synisys.trainigs.designPatterns.impl;

import java.util.ArrayList;
import java.util.List;

import main.com.synisys.trainigs.designPatterns.Command;
import main.com.synisys.trainigs.designPatterns.DeItem;

public class ApproveAllCommand implements Command {
	private List<DeItem> deItems = new ArrayList<>();

	public ApproveAllCommand(List<DeItem> deItems) {
		this.deItems = deItems;
	}

	@Override
	public void execute() {
		for (DeItem deItem : deItems) {
			deItem.approve();
		}		
	}
}
