package com.synisys.training.patterns.builder.interfaces;

/**
 * Created by Ashot Karapetyan on 11/4/2014.
 */
public interface From {
	Join join(String table);
	Where where(String condition);
	OrderBy orderBy(String... columns);
	String getQueryString();
}
