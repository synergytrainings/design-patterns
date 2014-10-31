package com.synisys.trainings.designPatterns.AbstractFactory;

import com.synisys.trainings.designPatterns.ColumnElement.ColumnMeasureElement;
import com.synisys.trainings.designPatterns.ColumnElementInterfaces.ColumnElement;

public class ColumnMeasureElementFactory implements ColumnElementFactory {

	public ColumnElement createColumnElement(String id, String name) {
		return new ColumnMeasureElement(id,name);
	}

}
