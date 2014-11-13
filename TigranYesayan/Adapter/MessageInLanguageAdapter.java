package com.synisys.trainings.Adapter;

public class MessageInLanguageAdapter
		implements MessageTranslation {

	MessageClass messageText;

	private String messageArmenian;
	private String messageRussian;

	public MessageInLanguageAdapter(MessageClass messageText) {
		this.messageText = messageText;
		messageArmenian = translator(Languages.ARMENIAN);
		messageRussian = translator(Languages.RUSSIAN);
	}

	public void setMessageArmenian(String mess) {
		messageArmenian = mess;
	}

	public String getMessageArmenian() {
		return messageArmenian;
	}

	public void setMessageRussian(String mess) {
		messageRussian = mess;
	}

	public String getMessageRussian() {
		return messageRussian;
	}

	public String translator(Languages languages) {
		switch (languages) {
			case ARMENIAN:
				return "Barev";
			case RUSSIAN:
				return "Privet";
			default:
				break;
		}
		return messageArmenian;
	}

}
