package com.synisys.trainings.designPatterns;

import java.util.ArrayList;

import com.synisys.trainings.designPatterns.AbstractFactory.ColumnCategoryElementFactory;
import com.synisys.trainings.designPatterns.AbstractFactory.ColumnElementFactory;
import com.synisys.trainings.designPatterns.AbstractFactory.ColumnMeasureElementFactory;
import com.synisys.trainings.designPatterns.ColumnElementInterfaces.ColumnElement;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ColumnElementFactory columnCategoryElementFactory = new ColumnCategoryElementFactory();
		Report report = new Report();
		report.addColumn(columnCategoryElementFactory, "1", "Sector");
		report.addColumn(columnCategoryElementFactory, "2", "Project");
		ArrayList<ColumnElement> columns = report.getColumns();
		for(int i = 0; i < columns.size(); i++){
			System.out.println("id=" + columns.get(i).getId() + " name=" + columns.get(i).getName() + " isCategory=" + columns.get(i).isCategoryElement());
		}
//		ColumnElementFactory columnMeasureElementFactory = new ColumnMeasureElementFactory();
//		report.addColumn(columnMeasureElementFactory, "3", "Commitment");
//		report.addColumn(columnMeasureElementFactory, "4", "Disbursement");
//		for(int i = 0; i < columns.size(); i++){
//			System.out.println("id=" + columns.get(i).getId() + " name=" + columns.get(i).getName() + " isCategory=" + columns.get(i).isCategoryElement());
//		}
		
	}

}
