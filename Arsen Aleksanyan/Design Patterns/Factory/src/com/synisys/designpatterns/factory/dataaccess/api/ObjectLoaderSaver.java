package com.synisys.designpatterns.factory.dataaccess.api;

public interface ObjectLoaderSaver {
	<T> T loadObject(String id, Class<T> clazz);
	void saveObject(String id, Object obj);
}
