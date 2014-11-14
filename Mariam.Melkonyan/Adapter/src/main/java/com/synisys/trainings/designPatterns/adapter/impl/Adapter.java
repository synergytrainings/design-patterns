package com.synisys.trainings.designPatterns.adapter.impl;

import java.util.HashMap;
import java.util.Map;

import com.synisys.trainings.designPatterns.adapter.interfaces.AdapterInterface;
import com.synisys.trainings.designPatterns.adapter.interfaces.Category;
import com.synisys.trainings.designPatterns.adapter.interfaces.MapView;
import com.synisys.trainings.designPatterns.adapter.interfaces.Measure;
import com.synisys.trainings.designPatterns.adapter.interfaces.Reporting;

public class Adapter extends ReportingImpl implements AdapterInterface{
	private MapView mapView = null;
	private Map< String, Category> adminBorderLocationMapping = new HashMap<String, Category>();
	public Adapter() {
		Category categoryimpl =  new CategoryImpl("A1_Location", "Location");
		this.adminBorderLocationMapping.put("Region", categoryimpl);
		this.mapView = new MapViewImpl();
	}
	public String drawScaling() {
		super.setCategory(adminBorderLocationMapping.get(this.mapView.getAdminBorderId()));
		String jsonData = super.loadData();
		return this.mapView.drawScaling(jsonData);
	}
	


}
