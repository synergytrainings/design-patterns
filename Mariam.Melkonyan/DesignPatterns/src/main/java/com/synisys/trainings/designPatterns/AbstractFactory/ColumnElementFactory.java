package com.synisys.trainings.designPatterns.AbstractFactory;

import com.synisys.trainings.designPatterns.ColumnElementInterfaces.ColumnElement;

public interface ColumnElementFactory {
	ColumnElement createColumnElement(String id, String name);
}
