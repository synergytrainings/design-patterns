package com.synisys.trainings.Adapter;

public class MessageTranslatorClass
		implements MessageTranslation {

	private String messageArmenian;
	private String messageRussian;

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
		return "";
	}

}
