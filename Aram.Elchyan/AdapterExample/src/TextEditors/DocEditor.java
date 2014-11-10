package TextEditors;

import TextFiles.DjvuFile;
import TextFiles.TxtFile;

/**
 * Created by Aram on 11/10/2014.
 */
public class DocEditor extends TextEditor {
    public DocEditor(String filePath) {
        super(filePath);
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
        DjvuFile file = new DjvuFile();
        // convertion implementation
        return file;
    }

    @Override
    public TxtFile ConvertToTxt() {
        TxtFile file = new TxtFile();
        // convertion implementation
        return file;
    }
}
