package com.synisys;

public class FacadeDemo {
	public static void main(String[] args) {
		ImportFacade importer = new ImportFacade();
		importer.importIatiData();
		importer.importOtherData();
	}
}
