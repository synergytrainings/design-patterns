package main.com.synisys.training.designPatterns.impl;

import main.com.synisys.training.designPatterns.Email;
import main.com.synisys.training.designPatterns.EmailDecorator;

public class ExternalEmailDecorator extends EmailDecorator {
	private String content;

	public ExternalEmailDecorator(Email basicEmail) {
		this.originalEmail = basicEmail;
	}

	@Override
	public String getContents() {
		// add disclaimer to original
		content = addDisclaimer(originalEmail.getContents());
		return content;
	}

	private String addDisclaimer(String message) {
		// append company disclaimer to message
		return message + "\n Synergy International Systems Disclaimer";
	}
}
