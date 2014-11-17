package com.synisys.abstraction;

import com.synisys.implementor.MessageSender;

public abstract class Message {
	protected MessageSender messageSender;

	abstract public void sendMessage(String message);

}