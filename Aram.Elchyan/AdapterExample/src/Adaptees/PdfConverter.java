package Adaptees;

import TextFiles.DjvuFile;
import TextFiles.DocFile;
import TextFiles.PdfFile;
import TextFiles.TxtFile;

import javax.print.Doc;

/**
 * Created by Aram on 11/10/2014.
 */
public class PdfConverter {
    private String filePath;

    public PdfConverter(String filePath) {
        this.filePath = filePath;
    }

    public TxtFile ConvertPdfToTxt() {
        TxtFile txtFile = new TxtFile();
        // conversation implementation
        return txtFile;
    }

    public DocFile ConvertPdfToDoc() {
        DocFile docFile = new DocFile();
        // conversation implementation
        return docFile;
    }

    public DjvuFile ConvertPdfToDjvu() {
        DjvuFile djvuFile = new DjvuFile();
        // conversation implementation
        return djvuFile;
    }
}
