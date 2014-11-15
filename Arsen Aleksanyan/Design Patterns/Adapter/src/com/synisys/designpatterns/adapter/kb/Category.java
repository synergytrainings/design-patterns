package com.synisys.designpatterns.adapter.kb;

public interface Category {
	int getId();
	String getName();
	String getApiName();
	
	Category getParentCategory();
}
