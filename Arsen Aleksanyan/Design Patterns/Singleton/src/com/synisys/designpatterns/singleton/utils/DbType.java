package com.synisys.designpatterns.singleton.utils;

public enum DbType {
	MSSQL("mssql"),
	ORACLE("oracle");
	
	private String vendorName;
	
	private DbType(String vendorName){
		this.vendorName = vendorName;
	}
	
	public String getVendorName(){
		return vendorName;
	}
}
