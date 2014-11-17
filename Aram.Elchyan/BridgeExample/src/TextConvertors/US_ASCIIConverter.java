package TextConvertors;

/**
 * Created by Aram on 11/17/2014.
 */
public class US_ASCIIConverter implements TextConverter {
    @Override
    public byte[] convertToBytes(String text) {
        byte[] bytes = new byte[0];
        // us-ascii specific implementation
        return bytes;
    }

    @Override
    public String convertToText(byte[] bytes) {
        String text = "";
        // us-ascii specific implementation
        return text;
    }
}
