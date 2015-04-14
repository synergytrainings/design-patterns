package com.synisys.trainings.Strategy;

import java.util.ArrayList;

public class Demo {
	public static void main(String[] args) {
		ArrayList<Row> allRows = loadRows();
		Context context = new Context(new SumStrategy());
		context.calculateRows(allRows);
		context = new Context(new AverageStrategy());
		context.calculateRows(allRows);
	}
	
	public static ArrayList<Row> loadRows(){
		ArrayList<Row> rows = new ArrayList<Row>();
		for(int i = 0; i < 5; i++){
			Row row = new Row();
			rows.add(row);
		}
		return rows;
	} 
}
