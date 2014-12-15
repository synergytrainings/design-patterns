package com.synisys.trainings.designPatterns.command.impl;

import com.synisys.trainings.designPatterns.command.api.Options;

public class OptionsImpl implements Options {
	private boolean hideUnspecifiedRows;
	private boolean hideEmptyRows;

	public boolean hideUnspecifiedRows() {
		return this.hideUnspecifiedRows;
	}

	public boolean hideEmptyRows() {
		return this.hideEmptyRows;
	}

	public void setHideUnspecifiedRows(boolean hideUnspecifiedRows) {
		this.hideUnspecifiedRows = hideUnspecifiedRows;
		
	}

	public void setHideEmptyRows(boolean hideEmptyRows) {
		this.hideEmptyRows = hideEmptyRows;
		
	}

}
