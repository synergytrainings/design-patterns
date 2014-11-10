package com.synisys.designpatterns.singleton.queries;

import java.util.HashMap;
import java.util.Map;

import com.synisys.designpatterns.singleton.utils.DbType;

public class SqlQueries {
	private DbType dbType;
	private String xmlFilePath;
	
	private Map<String, String> queries = new HashMap<String, String>();
	
	SqlQueries(DbType dbType, String xmlFilePath){
		this.dbType = dbType;
		this.xmlFilePath = xmlFilePath;
		
		loadXml();
	}
	
	public String getQuery(String queryId){
		return queries.get(queryId);
	}
	
	private void loadXml(){
		//loads XML file and fills queries into [queries] hash map <queryId, sql query>
	}
}
