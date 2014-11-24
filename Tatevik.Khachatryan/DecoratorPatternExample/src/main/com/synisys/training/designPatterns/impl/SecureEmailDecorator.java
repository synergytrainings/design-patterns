package main.com.synisys.training.designPatterns.impl;

import main.com.synisys.training.designPatterns.Email;
import main.com.synisys.training.designPatterns.EmailDecorator;

public class SecureEmailDecorator extends EmailDecorator {
	private String content;

	public SecureEmailDecorator(Email basicEmail) {
		this.originalEmail = basicEmail;
	}

	@Override
	public String getContents() {
		// secure original
		content = encrypt(originalEmail.getContents());
		return content;
	}

	private String encrypt(String message) {
		String encryptedMessage = message;
		// encrypt the string
		return encryptedMessage;
	}
}
