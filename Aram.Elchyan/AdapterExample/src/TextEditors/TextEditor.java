package TextEditors;

import TextFiles.DjvuFile;
import TextFiles.TxtFile;

/**
 * Created by Aram on 11/10/2014.
 */
public abstract class TextEditor {
    protected String filePath;

    public TextEditor(String filePath) {
        this.filePath = filePath;
    }

    public abstract int Search(String textToSearch);

    public abstract void InsertText(String Text, int lineNumber, int positiionInLine);

    public abstract void ReplaceText(String textToReplace, String replacementText);

    public abstract void DeleteText(int startLine, int FirstPositionInLine, int charachtersCount);

    public abstract DjvuFile ConvertToDjvu();

    public abstract TxtFile ConvertToTxt();
}
