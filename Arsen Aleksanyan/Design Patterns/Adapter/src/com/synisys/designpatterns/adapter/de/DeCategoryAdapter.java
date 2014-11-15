package com.synisys.designpatterns.adapter.de;

import com.synisys.designpatterns.adapter.kb.Category;

public class DeCategoryAdapter implements DeCategory {
	private Category kbCategory;
	
	private String javaName = "";
	private DeCategory ownerCategory;
	
	public DeCategoryAdapter(Category kbCategory){
		this.kbCategory = kbCategory;
		
		while(kbCategory != null){
			this.javaName = kbCategory.getName() + "_" + this.javaName;
			kbCategory = kbCategory.getParentCategory();
		}
		
		if(this.kbCategory.getParentCategory() != null){
			this.ownerCategory = new DeCategoryAdapter(this.kbCategory.getParentCategory());
		}
	}
	
	@Override
	public String getId() {
		return String.valueOf(kbCategory.getId());
	}
	
	@Override
	public String getName() {
		return kbCategory.getName();
	}
	
	@Override
	public String getJavaName() {
		return javaName;
	}
	
	@Override
	public String getUniqueName() {
		return kbCategory.getApiName();
	}
	
	@Override
	public DeCategory getOwnerCategory() {
		return ownerCategory;
	}
}
