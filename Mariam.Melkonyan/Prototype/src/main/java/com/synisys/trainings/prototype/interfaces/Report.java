package com.synisys.trainings.prototype.interfaces;

import java.util.List;

public interface Report {
	public String getHeader();
	public List<String> getRows();
	public void setRows(List<String> rows);
	public List<String> getColumns();
	public void setColumns(List<String> columns);
	public void addRow(String row);
	public void addColumn(String column);
	public void removeRow(String row);
	public void removeColumn(String column);
		
}
