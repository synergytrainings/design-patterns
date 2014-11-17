package TextEditors;

import TextConvertors.TextConverter;
import TextConvertors.TextEncoding;
import TextConvertors.US_ASCIIConverter;
import TextConvertors.UTF_32Converter;

/**
 * Created by Aram on 11/10/2014.
 */
public abstract class TextEditor {
    protected String filePath;

    protected TextConverter converter;

    public TextEditor(String filePath) {
        this.filePath = filePath;

        TextEncoding encoding = retrieveEncodingInfo(filePath);

        if(encoding == TextEncoding.US_ASCII) {
            converter = new US_ASCIIConverter();
        }
        else {
            converter = new UTF_32Converter();
        }
    }

    private TextEncoding retrieveEncodingInfo(String filePath) {
        TextEncoding encoding = TextEncoding.US_ASCII;
        return encoding;
    }

    public abstract int Search(String textToSearch);

    public abstract void InsertText(String text, int lineNumber, int positionInLine);

    public abstract void ReplaceText(String textToReplace, String replacementText);

    public abstract void DeleteText(int startLine, int FirstPositionInLine, int charactersCount);
}
