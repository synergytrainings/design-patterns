package com.synisys.trainings.proxy.impl;

import java.util.ArrayList;
import java.util.List;

import com.synisys.trainings.proxy.api.ListBuilder;

public class ListBuilderImpl implements ListBuilder{
	private List<String> measureIds;
	private List<String> categoryIds;
	
	public ListBuilderImpl() {
		loadFromDataBase();
	}

	private void loadFromDataBase() {
		measureIds = new ArrayList<String>(){{
			add("Commitment");
			add("Expenditure");
		}};
		categoryIds = new ArrayList<String>(){{
			add("Sector");
			add("Project");
		}};
	}
	
	public String draw() {
		return "ListBuilder is drawn with the measures " + measureIds.toString() + " and categories " + categoryIds.toString();
		
	}
	
}
