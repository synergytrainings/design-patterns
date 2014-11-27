package com.synisys.models;

import java.util.ArrayList;
import java.util.List;

import com.synisys.dao.ImportDAO;
import com.synisys.interfaces.Importer;

public class IatiImporter implements Importer {
	ImportDAO dao = new ImportDAO();
	/**
	 * Default path for iati registry
	 */
	private String url = "http://www.iatiregistry.org/dataset";

	public void importData() {
		dao.importIndicators(getDataFromRegistry());
	}

	private List<Indicator> getDataFromRegistry() {
		List<Indicator> indicators = new ArrayList<Indicator>();
		// Code for get data from iati registry(using this.url) and transform to
		// indicators list

		return indicators;
	}

}
