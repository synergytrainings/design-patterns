import TextEditors.PdfEditor;
import TextEditors.TextEditor;
import TextFiles.DjvuFile;

public class Main {

    public static void main(String[] args) {
        TextEditor editor = new PdfEditor("D:/hflskd/adsf/file.pdf");
        editor.InsertText("someText",45,12);
        DjvuFile djvuFile = editor.ConvertToDjvu();
    }
}
