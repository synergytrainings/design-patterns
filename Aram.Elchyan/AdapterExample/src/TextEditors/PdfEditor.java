package TextEditors;

import Adaptees.PdfConverter;
import TextFiles.DjvuFile;
import TextFiles.PdfFile;
import TextFiles.TxtFile;

/**
 * Created by Aram on 11/10/2014.
 */
public class PdfEditor extends TextEditor {
    private PdfConverter pdfConverter;

    public PdfEditor(String filePath) {
        super(filePath);
        PdfFile file = new PdfFile();
        pdfConverter = new PdfConverter(this.filePath);
    }

    @Override
    public int Search(String textToSearch) {
        int position = -1;
        //text search implamentation
        return position;
    }

    @Override
    public void InsertText(String Text, int lineNumber, int positiionInLine) {
        //insertion Implementation
    }

    @Override
    public void ReplaceText(String textToReplace, String replacementText) {
        //replacement implementation
    }

    @Override
    public void DeleteText(int startLine, int FirstPositionInLine, int charachtersCount) {
        //delete implementation
    }

    @Override
    public DjvuFile ConvertToDjvu() {
        return pdfConverter.ConvertPdfToDjvu();
    }

    @Override
    public TxtFile ConvertToTxt() {
        return pdfConverter.ConvertPdfToTxt();
    }
}
