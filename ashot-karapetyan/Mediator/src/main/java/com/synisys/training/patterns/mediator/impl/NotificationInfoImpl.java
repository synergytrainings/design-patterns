package com.synisys.training.patterns.mediator.impl;

import com.synisys.training.patterns.mediator.api.NotificationInfo;



public class NotificationInfoImpl implements NotificationInfo {

	private String description;

	public NotificationInfoImpl(String description) {
		this.description = description;
	}

	@Override
	public String getDescription() {
		return description;
	}
}
