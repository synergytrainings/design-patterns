package com.synisys.designpatterns.adapter.de;

public interface DeCategory {
	String getId();
	String getName();
	String getUniqueName();
	String getJavaName();
	
	DeCategory getOwnerCategory();
}
