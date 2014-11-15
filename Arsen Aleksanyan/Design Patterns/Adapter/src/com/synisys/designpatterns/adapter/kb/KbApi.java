package com.synisys.designpatterns.adapter.kb;

import java.util.List;

public class KbApi {
	private List<Category> kbCategories; //Suppose we have some initialized categories
	
	public List<Category> getCategories(){
		return kbCategories;
	}
}
