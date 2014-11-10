package com.synisys.designpatterns.singleton.queries;

import java.util.HashMap;
import java.util.Map;

import com.synisys.designpatterns.singleton.utils.DbType;

public class QueryProvider {
	private static QueryProvider INSTANCE;
	
	private Map<String, SqlQueries> queries = new HashMap<String, SqlQueries>();
	private DbType dbType;
	
	private QueryProvider(DbType dbType){
		if(dbType == null){
			throw new IllegalArgumentException("Db type cannot be null");
		}
		this.dbType = dbType;
	}
	
	/**
	 * Initializes the query provider for specific Db vendor
	 * @param dbType
	 */
	public static synchronized void initialize(DbType dbType){
		if(INSTANCE == null){
			INSTANCE = new QueryProvider(dbType);
		}
		else{
			throw new IllegalArgumentException("Provider already initialized");
		}
	}
	
	/**
	 * Gets the singleton instance if initialized. If not throws exception
	 * @return
	 */
	public static synchronized QueryProvider getInstance(){
		if(INSTANCE == null){
			throw new RuntimeException("Instance is not initialized");
		}
		
		return INSTANCE;
	}
	
	public synchronized SqlQueries getQueries(String xmlFilePath){
		SqlQueries qs = null;
		
		if((qs = queries.get(xmlFilePath)) == null){
			qs = new SqlQueries(this.dbType, xmlFilePath);
			queries.put(xmlFilePath, qs);
		}
		
		return qs;
	}
}
