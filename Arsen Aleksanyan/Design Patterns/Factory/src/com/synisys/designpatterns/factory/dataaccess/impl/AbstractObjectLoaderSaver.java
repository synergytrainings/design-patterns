package com.synisys.designpatterns.factory.dataaccess.impl;

import com.synisys.designpatterns.factory.dataaccess.api.Cache;
import com.synisys.designpatterns.factory.dataaccess.api.ObjectLoaderSaver;

abstract class AbstractObjectLoaderSaver implements ObjectLoaderSaver {
	protected Cache cache;
	
	public AbstractObjectLoaderSaver(Cache cache){
		if(cache == null){
			throw new IllegalArgumentException("Provided cache instance couldn't be null. At least it should be dummy");
		}
		this.cache = cache;
	}
}
