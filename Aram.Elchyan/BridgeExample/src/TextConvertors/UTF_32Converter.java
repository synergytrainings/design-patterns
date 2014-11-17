package TextConvertors;

/**
 * Created by Aram on 11/17/2014.
 */
public class UTF_32Converter implements TextConverter {
    @Override
    public byte[] convertToBytes(String text) {
        byte[] bytes = new byte[0];
        // utf-32 specific implementation
        return bytes;
    }

    @Override
    public String convertToText(byte[] bytes) {
        String text = "";
        // utf-32 specific implementation
        return text;
    }
}
