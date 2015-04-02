package com.synisys.trainings.Memento;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		
		IndicatorOriginator originator = new IndicatorOriginator();
		Indicator indicator = new Indicator();
		ArrayList<Row> rows = new ArrayList<Row>();
		Row row = new Row();
		row.setLevel(0);
		row.setName("Disaggregation1");
		row.setValue(new BigDecimal("100"));
		rows.add(row);
		indicator.setRows(rows);
		
		originator.setIndicator(indicator);
		IndicatorMemento memento = originator.createMemento();
		IndicatorCaretaker caretaker = new IndicatorCaretaker();
		caretaker.addMemento(memento);
		
		Indicator indicator2 = new Indicator();
		ArrayList<Row> rows2 = new ArrayList<Row>();
		Row row2 = new Row();
		row2.setLevel(0);
		row2.setName("Disaggregation1");
		row2.setValue(new BigDecimal("191"));
		rows2.add(row2);
		indicator2.setRows(rows2);

		originator.setIndicator(indicator2);
		
		memento = originator.createMemento();
		caretaker.addMemento(memento);
		
		System.out.println("Originator Current State: " + originator.getIndicator().getRows().get(0).getValue());
		System.out.println("Originator restoring to previous state...");
		memento = caretaker.getMemento(0);
		originator.setMemento(memento);
		System.out.println("Originator Current State: " + originator.getIndicator().getRows().get(0).getValue());
	}
}
