package com.synisys.trainings.Adapter;

public interface MessageTranslation {
	public void setMessageArmenian(String mess);

	public String getMessageArmenian();

	public void setMessageRussian(String mess);

	public String getMessageRussian();

	public String translator(Languages languages);
}
