package com.synisys.designpatterns.factory.dataaccess.impl;

import com.synisys.designpatterns.factory.dataaccess.api.Cache;
import com.synisys.designpatterns.factory.dataaccess.api.ObjectLoaderSaver;
import com.synisys.designpatterns.factory.dataaccess.utils.DataType;

public class ObjectLoaderSaverFactory {	
	private ObjectLoaderSaverFactory(){
		
	}
	
	public static ObjectLoaderSaver getObjectLoaderSaver(DataType dataType, Cache underlyingCache){
		switch(dataType){
		case XML:
			return new XMLLoaderSaver(underlyingCache);
		case MSSQL:
			return new SqlLoaderSaver(underlyingCache);
		case ORACLE:
			return new OracleLoaderSaver(underlyingCache);
		case BINARY:
			return new BinaryLoaderSaver(underlyingCache);
		default:
			throw new IllegalArgumentException(String.format("%s data type is not supported", dataType));
		}
	}
}
