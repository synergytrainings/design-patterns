package com.synisys.trainings.designPatterns.flyweight.impl;

import com.synisys.trainings.designPatterns.flyweight.api.HTMLElement;
import com.synisys.trainings.designPatterns.flyweight.api.HTMLElementContext;

public class HTMLElementImpl implements HTMLElement {
	private String name;
	
	public HTMLElementImpl(String name) {
		this.name = name;
	}
	
	public String draw(HTMLElementContext context) {
		String HTMLElementString = "";
		HTMLElementString = HTMLElementString + "<" + this.name 
				+ " style = \"" 
				+ "\"background-color\" : " + context.getBackgroundColor()
				+ "\"width\" : " + context.getWidth()
				+ "\"height\" : " + context.getHeight()
				+ "\""
				+ ">"
				+ "</" + this.name + ">";
		return HTMLElementString;		

	}

}
