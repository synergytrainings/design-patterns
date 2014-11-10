package com.synisys.models;

public class Boots extends Product{
	private Integer size;
	
	public Boots(Integer price, String name,Integer size) {
		super(price, name);
		this.size = size;
	}
}
