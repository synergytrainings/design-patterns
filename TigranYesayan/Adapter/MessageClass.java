package com.synisys.trainings.Adapter;

public class MessageClass
		implements Message {
	private String messageText;

	public String getMessageText() {
		return messageText;
	}

	public void setMessageText(String text) {
		messageText = text;
	}
}
