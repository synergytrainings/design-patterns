package com.synisys.trainings.designPatterns;

import java.util.ArrayList;

import com.synisys.trainings.designPatterns.AbstractFactory.ColumnElementFactory;
import com.synisys.trainings.designPatterns.ColumnElementInterfaces.ColumnElement;

public class Report {
	ArrayList<ColumnElement> columns = new ArrayList<ColumnElement>();
	
	ArrayList<ColumnElement> getColumns(){
		return columns;
	}
	
	void addColumn(ColumnElementFactory columnElementFactory, String id, String name){
			ColumnElement columnElement = columnElementFactory.createColumnElement(id, name);
			columns.add(columnElement);
	} 
}
