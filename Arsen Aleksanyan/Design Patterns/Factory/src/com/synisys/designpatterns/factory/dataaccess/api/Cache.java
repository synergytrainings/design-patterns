package com.synisys.designpatterns.factory.dataaccess.api;

public abstract class Cache implements ObjectLoaderSaver {
	private static final Cache DUMMY_CACHE = new DummyCache();
	private static Cache DEFAULT_CACHE;
	
	public static Cache noCache(){
		return DUMMY_CACHE;
	}
	
	public static synchronized Cache defaultCache(){
		if(DEFAULT_CACHE == null){
			DEFAULT_CACHE = new DefaultCacheImpl();
		}
		return DEFAULT_CACHE;
	}
}

class DefaultCacheImpl extends Cache {
	@Override
	public <T> T loadObject(String id, Class<T> clazz) {
		T obj = null;
		// loading from cache functionality
		return obj;
	}
	
	@Override
	public void saveObject(String id, Object obj) {
		// saving to cache
	}
}

class DummyCache extends Cache {
	@Override
	public <T> T loadObject(String id, Class<T> clazz) {
		// Do nothing
		return null;
	}
	
	@Override
	public void saveObject(String id, Object obj) {
		//Do nothing
	}
}
