package com.synisys.trainings.designPatterns.Builder;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Exporter exporter = new Exporter();

		// Pdf builder
		PdfBuilder pdfBuilder = new PdfBuilder();
		exporter.export(pdfBuilder);
		System.out.println(pdfBuilder.getPdfString());
		
		// Excel builder
		ExcelBuilder excelBuilder = new ExcelBuilder();
		exporter.export(excelBuilder);
		System.out.println(excelBuilder.getExcelString());
		
		// CSV builder		
		CSVBuilder csvBuilder = new CSVBuilder();
		exporter.export(csvBuilder);
		System.out.println(csvBuilder.getCSVString());
	}

}
