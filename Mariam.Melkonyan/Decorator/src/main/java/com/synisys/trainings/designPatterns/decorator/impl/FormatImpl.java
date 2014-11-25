package com.synisys.trainings.designPatterns.decorator.impl;

import com.synisys.trainings.designPatterns.decorator.api.Format;

public class FormatImpl implements Format {
	private boolean isItalic = false;
	private boolean isBold = false;
	private int fontSize = 10;
	
	public void setItalic(boolean isItalic){
		this.isItalic = isItalic;
	}
	public boolean isItalic() {
		return this.isItalic;
	}

	public void setBold(boolean isBold){
		this.isBold = isBold;
	}
	
	public boolean isBold() {
		return this.isBold;
	}

	public void setFontSize(int fontSize){
		this.fontSize = fontSize;
	}
	
	public int getFontSize() {
		return this.fontSize;
	}

}
