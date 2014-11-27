package com.synisys;

import com.synisys.models.IatiImporter;
import com.synisys.models.OtherImporter;

public class ImportFacade {
	private IatiImporter iatiImporter;
	private OtherImporter otherImporter;

	public ImportFacade() {
		iatiImporter = new IatiImporter();
		otherImporter = new OtherImporter();
	}

	public void importIatiData() {
		iatiImporter.importData();
	}

	public void importOtherData() {
		otherImporter.importData();
	}
}
