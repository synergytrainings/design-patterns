package com.synisys.trainings.designPatterns.command.api;

public interface Options {
	boolean hideUnspecifiedRows();
	void setHideUnspecifiedRows(boolean hideUnspecifiedRows);
	boolean hideEmptyRows();
	void setHideEmptyRows(boolean hideEmptyRows);
}
