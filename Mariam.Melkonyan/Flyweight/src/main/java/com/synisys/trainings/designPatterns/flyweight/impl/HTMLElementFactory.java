package com.synisys.trainings.designPatterns.flyweight.impl;

import java.util.HashMap;
import java.util.Map;

import com.synisys.trainings.designPatterns.flyweight.api.HTMLElement;

public class HTMLElementFactory {
	private Map<String, HTMLElement> generatedElements = new HashMap<String, HTMLElement>();
	
	public HTMLElement getHTMLElement(String name){
		if(generatedElements.get(name) == null){
			HTMLElement htmlElement =  new HTMLElementImpl(name);
			generatedElements.put(name, htmlElement);
		}
		return generatedElements.get(name);
	} 
}
