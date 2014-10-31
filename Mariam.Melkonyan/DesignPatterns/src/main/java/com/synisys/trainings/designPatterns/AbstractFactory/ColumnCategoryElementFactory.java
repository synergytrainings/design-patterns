package com.synisys.trainings.designPatterns.AbstractFactory;

import com.synisys.trainings.designPatterns.ColumnElement.ColumnCategoryElement;
import com.synisys.trainings.designPatterns.ColumnElementInterfaces.ColumnElement;

public class ColumnCategoryElementFactory implements ColumnElementFactory {

	public ColumnElement createColumnElement(String id, String name) {
		return new ColumnCategoryElement();
	}

}
