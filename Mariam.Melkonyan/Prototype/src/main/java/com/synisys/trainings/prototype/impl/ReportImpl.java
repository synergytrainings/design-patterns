package com.synisys.trainings.prototype.impl;
import java.util.ArrayList;
import java.util.List;

import com.synisys.trainings.prototype.interfaces.Report;


public class ReportImpl implements Report, Cloneable {
	private String header;
	private List<String> rows;
	private List<String> columns;

	public String getHeader() {
		return this.header;
	}
	
	public void setHeader(String header) {
		this.header = header;
	}

	public List<String> getRows() {
		return this.rows;
	}

	public void setRows(List<String> rows) {
		this.rows = rows;
	}
	
	public List<String> getColumns() {
		return this.columns;
	} 
	
	public void setColumns(List<String> columns) {
		this.columns = columns;
	}
	
	public void addColumn(String column) {
		if(this.columns == null){
			this.columns = new ArrayList<String>();
		}
		this.columns.add(column);
	}

	public void addRow(String row) {
		if(this.rows == null){
			this.rows = new ArrayList<String>();
		}
		this.rows.add(row);
	}
	
	public void removeRow(String row) {
		this.rows.remove(row);
	}

	public void removeColumn(String column) {
		this.columns.remove(column);
	} 

	public ReportImpl clone() {
		ReportImpl reportImpl = new ReportImpl();
		this.copyTo(reportImpl);
		return reportImpl;
	}
	
	public void copyTo(ReportImpl reportImpl){
		reportImpl.setHeader(this.header);
		reportImpl.setRows(this.rows);
		reportImpl.setColumns(this.columns);
	}
	
	@Override
	public String toString() {
		String reportString = "header = " + this.getHeader()
							+ " columns = " + this.getColumns().toString()
							+ " rows = " + this.getRows().toString();
		return reportString;					
	}

}
