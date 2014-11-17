package TextEditors;

/**
 * Created by Aram on 11/10/2014.
 */
public class PdfEditor extends TextEditor {

    public PdfEditor(String filePath) {
        super(filePath);
    }

    @Override
    public int Search(String textToSearch) {
        int position = -1;
        byte[] bytesToSearch = converter.convertToBytes(textToSearch);
        // bytes search implementation
        return position;
    }

    @Override
    public void InsertText(String text, int lineNumber, int positionInLine) {
        byte[] bytesToInsert = converter.convertToBytes(text);
        //insertion Implementation
    }

    @Override
    public void ReplaceText(String textToReplace, String replacementText) {
        //replacement implementation
    }

    @Override
    public void DeleteText(int startLine, int FirstPositionInLine, int charactersCount) {
        //delete implementation
    }
}
