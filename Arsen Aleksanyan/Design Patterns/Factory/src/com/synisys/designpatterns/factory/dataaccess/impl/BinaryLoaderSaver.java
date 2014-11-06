package com.synisys.designpatterns.factory.dataaccess.impl;

import com.synisys.designpatterns.factory.dataaccess.api.Cache;

class BinaryLoaderSaver extends AbstractObjectLoaderSaver {
	BinaryLoaderSaver(Cache cache){
		super(cache);
	}
	
	@Override
	public <T> T loadObject(String id, Class<T> clazz) {
		T obj;
		if((obj = cache.loadObject(id, clazz)) == null){
			//Binary loading functionality
		}
		return obj;
	}
	
	@Override
	public void saveObject(String id, Object obj) {
		cache.saveObject(id, obj);
		//Binary saving functionality
	}
}
