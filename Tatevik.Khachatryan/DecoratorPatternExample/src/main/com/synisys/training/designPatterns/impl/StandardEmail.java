package main.com.synisys.training.designPatterns.impl;

import main.com.synisys.training.designPatterns.Email;

public class StandardEmail implements Email{
	private String content;

	public StandardEmail(String content){
		this.content = content;
	}
	
	@Override
	public String getContents() {		
		return content;
	}
}
