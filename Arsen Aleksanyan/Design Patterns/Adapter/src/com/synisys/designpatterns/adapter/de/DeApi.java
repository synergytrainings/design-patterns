package com.synisys.designpatterns.adapter.de;

import java.util.ArrayList;
import java.util.List;

import com.synisys.designpatterns.adapter.kb.Category;
import com.synisys.designpatterns.adapter.kb.KbApi;

public class DeApi {
	private KbApi kbApi;
	
	public DeApi(KbApi kbApi){
		this.kbApi = kbApi;
	}
	
	public List<DeCategory> getCategories(){
		List<DeCategory> deCategories = new ArrayList<DeCategory>();
		
		for(Category category : kbApi.getCategories()){
			deCategories.add(new DeCategoryAdapter(category));
		}
		
		return deCategories;
	}
}
