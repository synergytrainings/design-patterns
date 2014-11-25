package com.synisys.trainings.designPatterns.decorator.api;

public interface Format {
	public boolean isItalic();
	public boolean isBold();
	public int getFontSize();
	public void setItalic(boolean italic);
	public void setBold(boolean bold);
	public void setFontSize(int fontSize);
}
